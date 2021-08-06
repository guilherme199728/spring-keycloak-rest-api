package app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RolesAllowed("user")
    @GetMapping("/user")
    public String helloUser() {
        return "hello user!";
    }

    @RolesAllowed("admin")
    @GetMapping("/admin")
    public String helloAdmin() {
        return "hello admin!";
    }

}
