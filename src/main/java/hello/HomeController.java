package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agup101 on 4/19/2017.
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }
}
