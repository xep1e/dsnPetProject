package com.example.demo.user;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
@Entity
@Table(name = "users")
public class Users {
   /* @Id
    @SequenceGenerator(
            name= "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = ("users_sequence")
    )*/
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Name;
    private String email;
    private LocalDate dob;
    private String password;
    @Transient
    private Integer age;


    public Users() {
    }

    public Users(Integer id, String email, String name,String password, LocalDate dob) {
        this.dob = dob;
        this.email = email;
        Name = name;
        this.id = id;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(String name, String email, LocalDate dob, String password) {
        Name = name;
        this.email = email;
        this.dob = dob;
        this.password=password;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {

        return Period.between(this.dob,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
