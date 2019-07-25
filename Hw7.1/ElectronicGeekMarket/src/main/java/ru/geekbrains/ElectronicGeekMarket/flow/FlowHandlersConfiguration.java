package ru.geekbrains.ElectronicGeekMarket.flow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.ElectronicGeekMarket.flow.register.UserRegisterHandler;
import ru.geekbrains.ElectronicGeekMarket.service.UserService;

@Configuration
public class FlowHandlersConfiguration {

    @Bean
    public UserRegisterHandler userRegisterHandler(UserService userService) {
        return new UserRegisterHandler(userService);
    }
}