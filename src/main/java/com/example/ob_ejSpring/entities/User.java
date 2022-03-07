package com.example.ob_ejSpring.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;

@ApiModel("User - Entidad usuario OBC")
@Entity
@Table(name = "Users")
public class User {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String gender;
    private LocalDate date_of_birth;
    @ApiModelProperty("Terms and conditions of App accepted")
    private Boolean term_and_condition;


    // Constructors

    public User() { }

    public User(Long id, String name, String surname, String email,
                String gender, LocalDate date_of_birth, Boolean term_and_condition) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.term_and_condition = term_and_condition;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Boolean getTerm_and_condition() {
        return term_and_condition;
    }

    public void setTerm_and_condition(Boolean term_and_condition) {
        this.term_and_condition = term_and_condition;
    }

    // ToString


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", term_and_condition=" + term_and_condition +
                '}';
    }

    public String toJSON(boolean activeId){
        String result = "{\n";
        if(activeId)
            result += " \"id\": " + id + ",\n";
        result += " \"name\": \"" + name + "\"" +
                ",\n \"surname\": \"" + surname + "\"" +
                ",\n \"email\": \"" + email + "\"" +
                ",\n \"gender\": \"" + gender + "\"" +
                ",\n \"date_of_birth\": \"" + date_of_birth + "\"" +
                ",\n \"term_and_condition\": " + term_and_condition +
                "\n}";
        return result;
    }

}
