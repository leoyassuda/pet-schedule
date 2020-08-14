package br.com.lny.petschedule;

import br.com.lny.petschedule.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.AbstractMap;
import java.util.Map;

@SpringBootApplication
public class PetScheduleApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PetScheduleApplication.class, args);

        Map<String, String> users = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Dog-A", "Dog-1"),
                new AbstractMap.SimpleEntry<>("Dog-B", "Dog-2"),
                new AbstractMap.SimpleEntry<>("Dog-C", "Dog-3"),
                new AbstractMap.SimpleEntry<>("Dog-D", "Dog-4"),
                new AbstractMap.SimpleEntry<>("Dog-E", "Dog-5")
        );

        UserService service = context.getBean(UserService.class);
        users.forEach(service::createUser);
    }

}
