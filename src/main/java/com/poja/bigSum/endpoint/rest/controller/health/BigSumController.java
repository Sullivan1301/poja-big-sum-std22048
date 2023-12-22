import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;

@RestController
public class BigSumController {
    @GetMapping("/big-sum")
    public String bigSum(@RequestParam("a") BigInteger a, @RequestParam("b") BigInteger b) {
        try {
            BigInteger result = a.add(b);
            return "La somme de " + a.toString() + " et " + b.toString() + " est : " + result.toString();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Les paramètres doivent être des nombres valides.", e);
        }
    }
}