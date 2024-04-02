package step_by_step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import step_by_step.services.UsersServices;

@SpringBootApplication
public class Applications implements CommandLineRunner {
    @Autowired
    UsersServices usersServices;
    public static void main(String[] args) {
        SpringApplication.run(Applications.class,args);
    }
    @Override
    public void run(String... args) throws Exception {

       //Return the User object having the username is   johndoe
        System.out.println(usersServices.getUsersByUsername("johndoe"));
    }
}