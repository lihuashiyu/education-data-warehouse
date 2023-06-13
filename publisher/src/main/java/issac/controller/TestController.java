package issac.controller;

import issac.util.Mappings;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Configuration
public class TestController
{
    
    @RequestMapping("/test")
    public String getInfo()
    {
        
        System.out.println("mapping = " + Mappings.getMappings());
        
        return Mappings.getMappings() + "";
    }
}
