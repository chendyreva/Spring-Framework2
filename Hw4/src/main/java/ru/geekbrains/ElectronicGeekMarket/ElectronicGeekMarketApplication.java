package ru.geekbrains.ElectronicGeekMarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;


@SpringBootApplication(exclude = {SessionAutoConfiguration.class})
public class ElectronicGeekMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicGeekMarketApplication.class, args);
	}

}

