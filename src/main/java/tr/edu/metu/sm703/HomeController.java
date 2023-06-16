package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int a = 5;
        int b = 3;

        String secretKey = getSecretKey();
        Cipher c = Cipher.getInstance("DES");

        return Collections.singletonMap("Sum", a+b);
    }

    public String getSecretKey()
    {
        String secretKey = "1234";

        return secretKey;
    }
}
