package br.com.lny.petschedule.events;

import br.com.lny.petschedule.model.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class UserChangedEvent extends ApplicationEvent {
    private User user;

    public UserChangedEvent(User user, Object source) {
        super(source);
        this.user = user;
    }
}
