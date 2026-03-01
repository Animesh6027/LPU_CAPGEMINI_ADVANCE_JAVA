package com.example.libraryManagementSystem.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    private long id;

    @NotBlank(message = "Name Cannot be blank")
    @Size(min = 3, message = "Name Should Contain Atleast 3 Characters")
    private String name;

    @Email(message = "Not a Valid Email")
    private String email;

    @Size(min = 6, message = "Password should be of min 6 Charaters")
    private String password;

    public User() {}
    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
