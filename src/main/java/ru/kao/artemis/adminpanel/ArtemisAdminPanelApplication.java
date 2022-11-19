package ru.kao.artemis.adminpanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.kao.artemis.adminpanel.config.AdminPanelProperties;

@SpringBootApplication
@EnableConfigurationProperties(AdminPanelProperties.class)
public class ArtemisAdminPanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtemisAdminPanelApplication.class, args);
	}

}
