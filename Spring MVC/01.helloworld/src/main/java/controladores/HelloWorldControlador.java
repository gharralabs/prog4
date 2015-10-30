package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldControlador {

    @RequestMapping("/ola")
    public String Cumprimentar()
    {
        return "helloworld";
    }
    
}
