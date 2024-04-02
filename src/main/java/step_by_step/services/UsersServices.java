package step_by_step.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import step_by_step.UsersRepository.UserDetails;
import step_by_step.UsersRepository.UsersRepository;
import step_by_step.model.Roles;
import step_by_step.model.Users;
import java.util.List;

@Service
public class UsersServices  implements UserDetails {
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
    public Users updateUser(Long userId, String fullName, String username, String password, String email, String contact, Roles role, boolean enabled) {
        Users user = repository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        user.setFullName(fullName);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setContact(contact);
        user.setRoles(role);
        user.setEnabled(enabled);
        return repository.save(user);
    }

    @Override
    public Users getUsersByUsername(String username) {
        try{
             for (Users user : repository.findAll()){
                if(user.getUsername().equals(username)){
                    return  user;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
