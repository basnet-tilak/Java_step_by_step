package step_by_step.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import step_by_step.model.Users;
import step_by_step.services.UserServices;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class UsersController {
    @Autowired
    UserServices services;
    @GetMapping("/user")
    public List<Users> getAllUsers(){
        return services.getAllUsers();
    }
}
