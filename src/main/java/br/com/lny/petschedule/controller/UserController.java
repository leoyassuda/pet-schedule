package br.com.lny.petschedule.controller;

import br.com.lny.petschedule.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers(){
        return new ArrayList<>();
    }
}
