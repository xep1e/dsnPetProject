package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UsersController {
    private final UsersServise usersServise;
@Autowired
    public UsersController(UsersServise usersServise) {
        this.usersServise = usersServise;
    }

    @GetMapping
    public List<Users> getUsers() {
        return usersServise.getUsers();
    }
    @PostMapping
    public  void  registerNewUser(@RequestBody Users users){
    usersServise.registerUsers(users.getName(),users.getEmail(),users.getPassword(),users.getDob());
    }
   /* @DeleteMapping (path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
    usersServise.deleteUser(userId);
    }*/
}

