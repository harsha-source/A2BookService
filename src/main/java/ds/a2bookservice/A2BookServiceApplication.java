package ds.a2bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers", "services", "repositories", "models"})
public class A2BookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(A2BookServiceApplication.class, args);
    }

}
