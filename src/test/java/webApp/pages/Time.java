package webApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Time extends BasePage {
    private final By employeeNameTextBox = By.cssSelector("input[placeholder='Type for hints...']");
    private final By viewButtonforATimeSheet = By.xpath("//div[3]/div[1]/div[3]/div[1]/button[1]");

    private  final  By employeeNameHeader=By.xpath("//h6[contains(normalize-space(), 'Timesheet for')]");
    private  final  By editButton=By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--ghost");

    private  final  By projectNameTextBox = By.cssSelector("input[placeholder='Type for hints...']");

    private  final  By ActivityDropDownArrow = By.xpath("//div[@class='oxd-select-text--after']");
    private  final  By AddButton =By.cssSelector(".oxd-icon.bi-plus");
    private final By saveButton =By.cssSelector("button[type='submit']");
    private final  By totalField =By.cssSelector(".orangehrm-timesheet-table-body-cell.--center.--freeze-right.--highlight-2");
    private final By submitButton =By.xpath("//div/button[normalize-space()='Submit']");
    private final By viewButton =By.cssSelector("button[type='submit']");
    private final By approveButton =By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--success orangehrm-left-space']");

    private final By timeSheetStatus = By.xpath("//p[normalize-space()='Status: Approved']");
    public WebElement getTotalField() {
        return findElement(totalField);
    }

    public WebElement getEmployeeName() {
        return findElement(employeeNameTextBox);
    }

    public WebElement getViewButton() {
        return findElement(viewButton);
    }

    public WebElement getAddButton() {
        return findElement( AddButton);
    }

    public WebElement getProjectNameTextBox() {
        return findElement(projectNameTextBox);
    }

    public WebElement getActivityDropDownArrow() {
        return findElement(ActivityDropDownArrow);
    }

   public WebElement getActivitySuggestion(String activity){
       String xpath =  "//div[@class='oxd-select-option']/span['"+activity+"']";
        By activitySuggestion = By.xpath(xpath);
        return findElement(activitySuggestion);
   }

    public WebElement getEmployeeNameSuggestion(String name){
        String xpath =  "//div[@role='option']/span['"+name+"']";
        By employeeNameSuggestion = By.xpath(xpath);
        return findElement(employeeNameSuggestion);
    }
    public WebElement getSaveButton() {
        return findElement(saveButton);
    }

    public WebElement getEditButton() {
        return findElement(editButton);

    }

    public WebElement getTimeSheet() {
        return findElement(viewButtonforATimeSheet);
    }

    public WebElement getDayTextBox(int n){
        By DayTextBox = By.xpath("//div[2]/table/tbody/tr[1]/td["+n+"]/div/div[2]/input");
        return findElement(DayTextBox);
    }

    public WebElement getTimeSheetStatus() {
        return findElement(timeSheetStatus);
    }

    public WebElement getProjectNameSearchSuggestion(String project) {
        String path =  "//div[@class='oxd-autocomplete-dropdown --positon-bottom']/div[@class='oxd-autocomplete-option']/span[contains(text(),'"+project+"')]";
        By projectNameSearchSuggestion = By.xpath(path);
        return findElement(projectNameSearchSuggestion);
    }
    public Admin clickOnApproveButton() {
        findElement(approveButton).click();
        return  new Admin();

    }

    public Admin clickOnSubmitButton() {
        findElement(submitButton).click();
        return new Admin();

    }
}
