package com.example.ob_ejSpring;

import com.example.ob_ejSpring.entities.User;
import com.example.ob_ejSpring.repositori.UserRepository;
import javassist.LoaderClassPath;
import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObEjSpringApplication {

	public static void main(String[] args) {
		// App init
		ApplicationContext context = SpringApplication.run(ObEjSpringApplication.class, args);

		// Repository init
		UserRepository myRepository = context.getBean(UserRepository.class);

		// add users
		myRepository.save(new User(null,"Davide","Fragnito","davidepie90@gmail.com","Hombre", LocalDate.of(1990,10,20),true));
		myRepository.save(new User(null,"Pablo","Lopez","lopez.pablo@gmail.com", "Hombre", LocalDate.of(1988,12,24),true));
		myRepository.save(new User(null,"María", "Rodriguez","m.rodri@gmail.com", "Mujer", LocalDate.of(1995,5,19),true));

	}

}
