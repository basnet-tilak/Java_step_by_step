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
    public void deleteUser(Long id){
        repository.deleteById(id);
    }
    public void updateUserById(Long id, String username){
        // id will not change but username will change
        if(repository.existsById(id)){
            repository.deleteById(id);
            repository.save(new Users(id, username));
        }else{
            System.out.println("User is not found");
        }
    }
}
