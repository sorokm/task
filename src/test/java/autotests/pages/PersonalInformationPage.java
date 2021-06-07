package autotests.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@Getter
public class PersonalInformationPage extends BasePage {

    public PersonalInformationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(id = "customer_firstname")
    private WebElement fieldFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement fieldLastName;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "address1")
    private WebElement addressField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(xpath = "//*[@id='id_state']")
    private WebElement stateDropdown;

    @FindBy(id = "postcode")
    private WebElement postcodeField;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhoneField;

    @FindBy(id = "submitAccount")
    private WebElement submitButton;

    public void selectStateDropdown() {
        Select dropdownMenu = new Select(stateDropdown);
        dropdownMenu.selectByVisibleText("Alabama");
    }
}
