package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Login extends BasePage {

    private final By PasswordTextBox = By.name("password");
    private final By UserNameTextBox = By.name("username");
    private final By LoginButton = By.xpath("//button[@type='submit']");
    private final By invalidCredentialErrorMessage = By.cssSelector("div[role='alert']");

    public WebElement getErrorMessage() {
        return findElement(invalidCredentialErrorMessage);
    }
    public void loginWith(String userName, String password) {
        findElement(UserNameTextBox).sendKeys(userName);
        findElement(PasswordTextBox).sendKeys(password);
    }

    public Dashboard clickOnLoginButton() {

        findElement(LoginButton).click();
        return new Dashboard();

    }
}
