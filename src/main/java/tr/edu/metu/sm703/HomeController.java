package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        int a = 5;
        int b = 3;

        return Collections.singletonMap("Sum of Integers", a+b);
    }
}
