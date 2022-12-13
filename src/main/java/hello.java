
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping(value="/")
    public String getMethodName(){
        return "Ola galera";
    }

}
