package com.example.ob_ejSpring.controller;

/*import com.example.ob_ejSpring.ObEjSpringApplication;
import com.example.ob_ejSpring.entities.User;
import com.example.ob_ejSpring.repositori.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.ApplicationContext;
import org.springframework.http.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/
class UserControllerTest {

    /*private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;


    @BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }

    @Test
    void findAll() {
        System.out.println("Start to findAllTest: ");
        ResponseEntity<User[]> result =
                testRestTemplate.getForEntity("/api/users", User[].class);
        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals(200, result.getStatusCodeValue());
        List<User> user = Arrays.asList(result.getBody());
        assertEquals(2, user.size());
    }

    @Test
    void findOneById() {
        System.out.println("Start to findOneByIdTest: ");
        ResponseEntity<User> result =
                testRestTemplate.getForEntity("/api/users/1", User.class);
        assertEquals(HttpStatus.OK, result.getStatusCode());
        result = testRestTemplate.getForEntity("/api/users/10", User.class);
        assertEquals(HttpStatus.NOT_FOUND, result.getStatusCode());
    }

    @Test
    void create() {
        System.out.println("Start to createTest: ");
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        User myTestUser = new User(null,"María","Rodriguez", "m.rodri@gmail.com","Mujer", LocalDate.of(1995,5,19),true);
        HttpEntity<String> request = new HttpEntity<>(myTestUser.toJSON(false), header);
        ResponseEntity<User> response =
                testRestTemplate.exchange("/api/users", HttpMethod.POST, request, User.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(401, response.getStatusCodeValue());
        myTestUser = response.getBody();
        assertEquals(1L, myTestUser.getId());
        assertEquals("María", myTestUser.getName());
        myTestUser = new User(null,"Pablo","Lopez","lopez.pablo@gmail.com", "Hombre", LocalDate.of(1988,12,24),true);
        request = new HttpEntity<>(myTestUser.toJSON(false), header);
        response = testRestTemplate.exchange("/api/users", HttpMethod.POST, request, User.class);
        ResponseEntity<User[]> findAll =
                testRestTemplate.getForEntity("/api/users", User[].class);
        List<User> user = Arrays.asList(findAll.getBody());
        assertEquals(2, user.size());
        request = new HttpEntity<>(null, header);
        response = testRestTemplate.exchange("/api/users", HttpMethod.POST, request, User.class);
        assertEquals(400, response.getStatusCodeValue());
    }

    @Test
    void update() {
        System.out.println("Start to updateTest: ");
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        User myTestUser = new User(1L,"María","Fernandez", "m.ferny@gmail.com","Mujer", LocalDate.of(1995,5,19),true);
        HttpEntity<String> request = new HttpEntity<>(myTestUser.toJSON(true), header);
        ResponseEntity<User> response =
                testRestTemplate.exchange("/api/users", HttpMethod.PUT, request, User.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200, response.getStatusCodeValue());
        ResponseEntity<User[]> result =
                testRestTemplate.getForEntity("/api/users", User[].class);
        List<User> user = Arrays.asList(result.getBody());
        assertEquals(2, user.size());
        User otherUser = null;
        for (User i : user) {
            if (i.getName().equalsIgnoreCase("María")) {
                otherUser = i;
            }
        }
        if (otherUser != null)
            assertEquals("Fernandez", otherUser.getSurname());
        // without id
        request = new HttpEntity<>(myTestUser.toJSON(false), header);
        response = testRestTemplate.exchange("/api/users", HttpMethod.PUT, request, User.class);
        assertEquals(400, response.getStatusCodeValue());
        request = new HttpEntity<>(null, header);
        response = testRestTemplate.exchange("/api/users", HttpMethod.PUT, request, User.class);
        assertEquals(400, response.getStatusCodeValue());
    }

    @Test
    void delete() {
    }

    @Test
    void deleteAll() {
    }*/
}