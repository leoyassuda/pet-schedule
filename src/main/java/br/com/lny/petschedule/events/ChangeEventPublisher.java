package br.com.lny.petschedule.events;

import br.com.lny.petschedule.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ChangeEventPublisher {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishUserChange(User user) {
        UserChangedEvent userChangedEvent = new UserChangedEvent(user, this);
        this.publisher.publishEvent(userChangedEvent);
    }
}
