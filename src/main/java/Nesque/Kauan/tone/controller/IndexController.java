package Nesque.Kauan.tone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String alert(){
        return "wellcome to site ";
    }
}
