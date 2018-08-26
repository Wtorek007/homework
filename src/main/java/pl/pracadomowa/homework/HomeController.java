package pl.pracadomowa.homework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {



@GetMapping("/")
public String hello(){

    return "hello";
}

@GetMapping("/display")
public String showResult(
        @RequestParam String name, @RequestParam String description,
        ModelMap map
) {
    System.out.println("Nazwa to "+name+" a opis to "+description);
    Set set = new Set(name,description);
    map.put("result",set);

    return "display";
    }

}
