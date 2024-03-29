package ru.geekbrains.Hw1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.Hw1.persist.model.Role;
import ru.geekbrains.Hw1.persist.model.User;
import ru.geekbrains.Hw1.persist.repo.RoleRepository;
import ru.geekbrains.Hw1.persist.repo.UserRepository;
import ru.geekbrains.Hw1.service.model.SystemUser;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceJpaImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceJpaImpl(UserRepository userRepository, RoleRepository roleRepository,
                              BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public SystemUser findById(Long id) {
        return new SystemUser(userRepository.findById(id).get());
    }

    @Override
    @Transactional
    public SystemUser findByUserName(String username) {
        User user = userRepository.findOneByUserName(username);
        return new SystemUser(user.getUserName(), user.getPassword(),
                user.getFirstName(), user.getLastName(), user.getEmail(), user.getRoles());
    }

    @Override
    @Transactional
    public boolean save(SystemUser systemUser) {
        User user = systemUser.getId() != null ? userRepository
                .findById(systemUser.getId())
                .orElse(new User()) : new User();
        user.setUserName(systemUser.getUserName());
        if (systemUser.getId() == null || (systemUser.getPassword() != null && !systemUser.getPassword().trim().isEmpty())) {
            user.setPassword(passwordEncoder.encode(systemUser.getPassword()));
        }
        user.setFirstName(systemUser.getFirstName());
        user.setLastName(systemUser.getLastName());
        user.setEmail(systemUser.getEmail());
        user.setRoles(new HashSet<>(Collections.singletonList(roleRepository.findOneByName("ROLE_CLIENT"))));
        userRepository.save(user);
        return true;
    }

    @Override
    public List<SystemUser> findAll() {
        return userRepository.findAll().stream()
                .map(SystemUser::new)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SystemUser user = findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
                mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
