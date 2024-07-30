package org.example.appointment;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppointmentApplication {

	public static void main(String[] args) {
		SpringApplication applicationContext = new  SpringApplication(AppointmentApplication.class);
		applicationContext.setBannerMode(Banner.Mode.OFF);
		applicationContext.run(args);
	}

}
