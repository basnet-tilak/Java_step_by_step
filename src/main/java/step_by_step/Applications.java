package step_by_step;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class Applications implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Applications.class,args);
    }
    @Override
    public void run(String... args) throws Exception {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the your Name: ");
        String name = obj.next();
        System.out.println(name);
    }
}