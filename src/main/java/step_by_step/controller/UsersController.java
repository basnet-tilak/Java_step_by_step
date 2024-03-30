package step_by_step.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import step_by_step.model.Users;
import step_by_step.services.UserServices;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {
    @Autowired
    UserServices services;
    @GetMapping("/get")
    public List<Users> getAllUsers(){
        return services.getAllUsers();
    }
    @PostMapping("/post")
    public void createNewUser(@RequestBody Users users){
        services.createUser(users);
    }
    @PutMapping("/put")
    public void updateUser(@RequestBody Users users){
        services.updateUserById(users.getUserId(), users.getUsername());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long id){
        services.deleteUser(id);
    }
}
