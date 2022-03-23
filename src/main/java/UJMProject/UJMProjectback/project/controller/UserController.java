package UJMProject.UJMProjectback.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @ResponseBody
    @GetMapping("/kakaoAuth")
    public void  kakaoCallback(@RequestParam String code){

        System.out.println("code : "+code);

    }
}
