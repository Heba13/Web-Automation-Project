package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Admin extends BasePage {

    private final By addButton = By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']");
    private final By roleArrow = By.xpath("//div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]");

    private final By statusArrow = By.xpath("//div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]");
    private final By employeeNameTextBox = By.xpath("//input[@placeholder='Type for hints...']");

    private final By newUserNameTextBox = By.xpath("//input[@class='oxd-input oxd-input--active' and @autocomplete='off'][1]");
    private final By newUserPasswordTextBox = By.cssSelector("input[type='password']");
    private final By newUserPasswordConfirmationTextBox = By.xpath("//div[@class='oxd-form-row user-password-row']/div/div[2]//input");
    private final By accountIcon = By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
    private final By logOutOption = By.xpath("//li/a[normalize-space()='Logout']");
    private final By saveButton = By.cssSelector("button[type='submit']");
    private final By successMessage = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text'][normalize-space()='Success']");

    public WebElement getSuccessMessage() {
        return findElement(successMessage);
    }

    public WebElement getSaveButton() {
        return findElement(saveButton);
    }

    public WebElement getAddButton() {
        return findElement(addButton);
    }

    public WebElement getEmployeeName() {return findElement(employeeNameTextBox); }
    public WebElement getNewUserNameTextBox() {
        return findElement(newUserNameTextBox);
    }

    public WebElement getNewPasswordTextBox() {
        return findElement(newUserPasswordTextBox);
    }

    public WebElement getNewPasswordConfirmationTextBox() {
        return findElement(newUserPasswordConfirmationTextBox);
    }

    public WebElement getRightSuggestion(String name) {
        String xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']/div/span['" + name + "']";
        By employeeNameSuggestion = By.xpath(xpath);
        return findElement(employeeNameSuggestion);

    }

    public WebElement getEditeButtonForUser(String name) {
        String xpath = "//div[@role='row'][contains (normalize-space(), '" + name + "')]/div[6]/div/button[2]";
        By EditeButtonForUser = By.xpath(xpath);
        scrollPageToElement(findElement(EditeButtonForUser));
        return findElement(EditeButtonForUser);
    }

    public WebElement getAccountIcon() {
        return findElement(accountIcon);
    }

    public Login clickOnLogOutOption() {
        findElement(logOutOption).click();
        return new Login();
    }

    public void selectRoleOption(String option) {
        clickOnRoleDropDownArrow();
        //  String xpath =  "//div[@class='oxd-select-dropdown --positon-bottom']/div[@class='oxd-select-option']/span['"+option+"']";
        String xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/div[@class='oxd-select-option']/span[contains(text(),'ESS')]";
        System.out.println(xpath);
        By roleDropDownOption = By.xpath(xpath);
        findElement(roleDropDownOption).click();
    }

    public void selectStatus(String status) {
        clickOnStatusDropDownArrow();
        By statusDropDownOption = By.xpath("//div[@class='oxd-select-option']/span[text()='" + status + "']");
        findElement(statusDropDownOption).click();

    }

    public void clickOnRoleDropDownArrow() {
        findElement(roleArrow).click();
    }

    public void clickOnStatusDropDownArrow() {
        findElement(statusArrow).click();
    }


}
