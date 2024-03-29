package step_by_step.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import step_by_step.UsersRepository.UsersRepository;
import step_by_step.model.Users;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UsersRepository repository;
    public void createUser(Users users){
       repository.save(users);
    }
    public List<Users> getAllUsers(){
        return repository.findAll();
    }
}
