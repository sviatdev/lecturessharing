package com.myproject.lecturessharing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingsController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue="World") String name,
            Map<String, Object> model){
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String mainPage(Map<String, Object> model){
        model.put("some", "hello, LS's users");
        return "mainpage";
    }
}
