package step_by_step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import step_by_step.model.Users;
import step_by_step.services.UserServices;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Applications implements CommandLineRunner {
    @Autowired
    UserServices userServices;
    public static void main(String[] args) {
        SpringApplication.run(Applications.class,args);
    }
    @Override
    public void run(String... args) throws Exception {
        Users user = new Users();
        // read the data from the database
        List<Users> list = new ArrayList<>(userServices.getAllUsers());
        for (Users users : list){
            System.out.println(users.getUsername());
        }
        // Create a new user
        /*
        user.setUserId(2L);
        user.setUsername("Indra");
        userServices.createUser(new Users(users.getUserId(), users.getUsername()));
        */
        //userServices.deleteUser(1L);
        //userServices.updateUserById(2L, "Tilak Basnet");
    }
}