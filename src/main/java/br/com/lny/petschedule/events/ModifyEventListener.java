package br.com.lny.petschedule.events;

import br.com.lny.petschedule.model.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ModifyEventListener implements ApplicationListener<UserChangedEvent> {

    @Override
    public void onApplicationEvent(UserChangedEvent userChangedEvent) {
        User user = userChangedEvent.getUser();
        user.setFirstname("MODIFY " + user.getFirstname());
        log.info("ModifyEventListener#onApplicationEvent user={}", user);
    }
}
