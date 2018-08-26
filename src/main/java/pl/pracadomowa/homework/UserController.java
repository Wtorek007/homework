package pl.pracadomowa.homework;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.soap.SOAPBinding;

@Controller
public class UserController {

    @GetMapping
    public String addUser(){
        return "user";

    }

    @PostMapping("/user")
    public String show(@RequestParam String username,
                       @RequestParam String email,
                       ModelMap map) {
        User user = new User(username,email);
        map.put("user", user);

        return "show";
    }
}
