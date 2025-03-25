package ch.csbe.uek295_boilerplate.resources.playground.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Users")
public class UsersController {
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
