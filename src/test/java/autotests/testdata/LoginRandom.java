package autotests.testdata;
import java.util.Random;

public class LoginRandom {

    public static String getRandomLogin() {
        Random random = new Random();
        int randomNumbers = random.nextInt(1000);
        String login = "testlogin" + randomNumbers + "@mail.ru";
        return login;
    }
}
