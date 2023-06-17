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
        int b = 6;

        return Collections.singletonMap("Sum qa", getSum(a, b));
    }

    public int getSum(int a, int b)
    {
        return a + b;
    }
}
