package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServise {
    private final UsersRepository usersRepository;
@Autowired
    public UsersServise(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();

    }

    public  Users registerUsers(String name, String email, String password, LocalDate dob){

    Users user=new Users();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setDob(dob);
        return usersRepository.save(user);
    }

    /*public void addNewUser(Users users) {
        Optional<Users> usersOptional= usersRepository.findUserByEmail(users.getEmail());
        if (usersOptional.isPresent()){
            throw new IllegalStateException("Email taken");
        }
         usersRepository.save(users);
    }*/

    /*public void deleteUser(Long userId) {
    boolean exeist= usersRepository.existsById(userId);
    if (!exeist){
        throw new IllegalStateException("user with id " + userId+ "doesnt exists");
    }
    usersRepository.deleteById(userId);
    }*/
}
