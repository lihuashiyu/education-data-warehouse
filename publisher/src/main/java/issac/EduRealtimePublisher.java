package issac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "issac.mapper")
public class EduRealtimePublisher
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(EduRealtimePublisher.class, args);
    }
    
}
