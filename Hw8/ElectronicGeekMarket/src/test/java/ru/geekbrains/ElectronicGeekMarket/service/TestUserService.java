package ru.geekbrains.ElectronicGeekMarket.service;
import org.junit.Before;
import org.junit.Test;

import ru.geekbrains.ElectronicGeekMarket.service.repr.SystemUser;
import ru.geekbrains.ElectronicGeekMarket.persist.model.User;
import ru.geekbrains.ElectronicGeekMarket.persist.model.Role;


public class TestUserService {

    private  UserService userService;

    @Before
    public void init() {
        userService = new UserServiceJpaImpl();
    }

    @Test
    public void testUserService() {

        SystemUser expectedSystemUser = new SystemUser();
        expectedSystemUser.setId(1L);
        expectedSystemUser.setUserName("userName");
        expectedSystemUser.setPassword("password");
        expectedSystemUser.setFirstName("firstName");
        expectedSystemUser.setLastName("lastName");
        expectedSystemUser.setEmail("email");


        User expectedUser = new User();
        expectedUser.setId(1L);
        expectedUser.setUserName("userName");
        expectedUser.setPassword("password");
        expectedUser.setFirstName("firstName");
        expectedUser.setLastName("lastName");
        expectedUser.setEmail("email");


        Role expectedRole = new Role();
        expectedRole.setId(1L);
        expectedRole.setName("name");
    }

}
