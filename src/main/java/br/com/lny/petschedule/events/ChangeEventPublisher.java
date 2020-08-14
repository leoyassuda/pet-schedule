package br.com.lny.petschedule.events;

import br.com.lny.petschedule.model.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ChangeEventPublisher {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishUserChange(User user) {
        log.info("Publishing change user event.");
        UserChangedEvent userChangedEvent = new UserChangedEvent(user, this);
        this.publisher.publishEvent(userChangedEvent);
    }
}
