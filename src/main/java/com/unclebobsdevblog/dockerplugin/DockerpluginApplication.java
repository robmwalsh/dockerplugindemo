package com.unclebobsdevblog.dockerplugin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerpluginApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerpluginApplication.class, args);
        System.out.print("I made a change :D");
	}
}
