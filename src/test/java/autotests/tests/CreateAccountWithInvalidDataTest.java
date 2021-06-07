package autotests.tests;

import autotests.pages.CreateAccountPage;
import autotests.pages.HomePage;
import autotests.pages.PersonalInformationPage;
import autotests.testdata.LoginRandom;
import autotests.testdata.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountWithInvalidDataTest extends BaseTest {

    @Test
    public static void createAccountWithInvalidPassword() {
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        CreateAccountPage createAccountPage =
            PageFactory.initElements(webDriver, CreateAccountPage.class);
        PersonalInformationPage personalInformationPage =
            PageFactory.initElements(webDriver, PersonalInformationPage.class);

        //Open site
        homePage.openSite();

        //Open create account page
        homePage.openCreateAccountPage();

        //Fill email field
        createAccountPage.getFieldEmail().sendKeys(LoginRandom.getRandomLogin());
        createAccountPage.getCreateAccount().click();

        //Fill personal information fields
        personalInformationPage.getFieldFirstName().sendKeys(TestData.FIRST_NAME);
        personalInformationPage.getFieldLastName().sendKeys(TestData.LAST_NAME);
        personalInformationPage.getPasswordField().sendKeys(TestData.PASS_INVALID);
        personalInformationPage.getAddressField().sendKeys(TestData.ADDRESS);
        personalInformationPage.getCityField().sendKeys(TestData.CITY);
        personalInformationPage.selectStateDropdown();
        personalInformationPage.getPostcodeField().sendKeys(TestData.POSTCODE);
        personalInformationPage.getMobilePhoneField().sendKeys(TestData.MOBILE_PHONE);

        //Submit
        personalInformationPage.getSubmitButton().click();

        //Assert error because of invalid password
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id='center_column']/div")).isDisplayed());
    }
}
