package ch.csbe.uek295_boilerplate.resources.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class testController {

    @GetMapping
    public String helloWorld() {
        return "The Application is running...";
    }
}
