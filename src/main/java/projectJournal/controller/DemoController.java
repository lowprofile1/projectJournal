package projectJournal.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        for (int i = 0; i < 999; i++) {
            System.out.println("test" + i);
        }
        return "done";
    }
}
