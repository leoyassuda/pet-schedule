package br.com.lny.petschedule.events;

import br.com.lny.petschedule.model.User;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ChangeEventListener implements ApplicationListener<UserChangedEvent> {

    @Override
    public void onApplicationEvent(UserChangedEvent userChangedEvent) {
        User user = userChangedEvent.getUser();
        System.out.println("UserChangedEvent: { firstname: " +
                user.getFirstname() + ", lastname: " + user.getLastname() + "}");
    }
}
