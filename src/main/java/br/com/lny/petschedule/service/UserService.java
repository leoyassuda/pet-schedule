package br.com.lny.petschedule.service;

import br.com.lny.petschedule.events.ChangeEventPublisher;
import br.com.lny.petschedule.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private ChangeEventPublisher publisher;

    public User createUser(String firstname, String lastname) {
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);

        this.publisher.publishUserChange(user);

        return user;
    }
}
