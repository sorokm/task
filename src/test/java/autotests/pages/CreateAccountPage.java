package autotests.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(id = "email_create")
    private WebElement fieldEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccount;
}
