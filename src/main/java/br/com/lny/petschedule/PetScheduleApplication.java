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
                new AbstractMap.SimpleEntry<>("Omar", "Buchain"),
                new AbstractMap.SimpleEntry<>("Kelly", "Alves"),
                new AbstractMap.SimpleEntry<>("Gui", "Alves"),
                new AbstractMap.SimpleEntry<>("Leo", "Yassuda"),
                new AbstractMap.SimpleEntry<>("Oswaldo", "Graziotto")
        );

        UserService service = context.getBean(UserService.class);
        users.forEach(service::createUser);
    }

}
