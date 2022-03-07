package com.example.ob_ejSpring.controller;

import com.example.ob_ejSpring.entities.User;
import com.example.ob_ejSpring.repositori.UserRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    // Attribute
    private final Logger log = LoggerFactory.getLogger(UserController.class);
    private UserRepository userRepository;

    // Constructor
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Download the list of users and check if there is a user
     * with the same name and surname
     * @param name
     * @param surname
     * @return
     */
    private boolean exist(String name, String surname){
        List<User> total = userRepository.findAll();
        for(User i : total){
            if(i.getName().equalsIgnoreCase(name) && i.getSurname().equalsIgnoreCase(surname))
                return true;
        }
        return false;
    }

    // Methods CRUD

    /**
     * Returns all users
     * http://localhost:8081/api/users
     * @return
     */
    @GetMapping("/api/users")
    public ResponseEntity<List<User>> findAll(){
        if(null == userRepository)
            return ResponseEntity.notFound().build();
        List<User> result = userRepository.findAll();
        return ResponseEntity.ok(result);
    }

    /**
     * Find a single user with id, returns error 404 if it does not exist
     * http://localhost:8081/api/users/1
     * @param id
     * @return
     */
    @ApiOperation("Insert primary key id Long")
    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> findOneById(@ApiParam("Primary key Long") @PathVariable Long id){
        if(null == userRepository)
            return ResponseEntity.notFound().build();
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Create a new user
     * http://localhost:8081/api/users
     * @param user
     * @return
     */
    @PostMapping("/api/users")
    public ResponseEntity<User> create(@RequestBody User user){
        if(null == userRepository)
            return ResponseEntity.notFound().build();
        if(null == user){
            log.warn("Null parameter for creating a new user. ");
            return ResponseEntity.noContent().build();
        }
        if(null != user.getId()){
            log.warn("Trying to create a user with id. ");
            return ResponseEntity.badRequest().build();
        }
        if(exist(user.getName(),user.getSurname())){
            log.warn("Trying to create a present user. ");
            return ResponseEntity.badRequest().build();
        }
        User result = userRepository.save(user);
        return ResponseEntity.ok(result);
    }

    /**
     * Update an existing user
     * http://localhost:8081/api/users
     * @param user
     * @return
     */
    @PutMapping("/api/users")
    public ResponseEntity<User> update(@RequestBody User user){
        if(null == userRepository)
            return ResponseEntity.notFound().build();
        if(null == user){
            log.warn("Null parameter for updating a new user. ");
            return ResponseEntity.noContent().build();
        }
        if(user.getId() == null){
            log.warn("Trying to update a non existent user. ");
            return ResponseEntity.badRequest().build();
        }
        if(!userRepository.existsById(user.getId())){
            log.warn("Trying to update a non existent user. ");
            return ResponseEntity.notFound().build();
        }
        User result = userRepository.save(user);
        return ResponseEntity.ok(result);
    }

    /**
     * Find a single user with id, returns error 404 if it does not exist
     * http://localhost:8081/api/users/1
     * @param id
     * @return
     */
    @ApiIgnore
    @DeleteMapping("/api/users/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id){
        if(null == userRepository)
            return ResponseEntity.notFound().build();
        if(!userRepository.existsById(id)){
            log.warn("Trying to delete a non existent user. ");
            return ResponseEntity.notFound().build();
        }
        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * Clear all users
     * http://localhost:8081/api/users
     * @return
     */
    @ApiIgnore
    @DeleteMapping("api/users")
    public ResponseEntity<User> deleteAll(){
        log.info("REST request for delete all users. ");
        userRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
