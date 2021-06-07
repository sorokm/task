package autotests.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(className = "login")
    private WebElement signUpButton;

    public void openSite() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    public void openCreateAccountPage() {
        signUpButton.click();
    }
}
