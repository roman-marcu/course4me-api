package dev.romanmarcu.courseservice.system;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {

    @GetMapping("/")
    public String sayHi() {
        return "Hi !!!";
    }
}
