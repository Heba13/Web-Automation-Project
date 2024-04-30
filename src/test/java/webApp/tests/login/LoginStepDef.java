package webApp.tests.login;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import webApp.WebApp;
import webApp.tests.BaseTest;

import java.io.IOException;

public class LoginStepDef extends BaseTest {

    public WebApp webApp = new WebApp();

    public LoginStepDef() throws IOException {
    }

    @When("user can login using {string} and {string} in login page")
    public void userCanLoginUsingAndInLoginPage(String userName, String password) {
        webApp.login.loginWith(userName, password);
    }

    @When("click on Login Button in login page")
    public void clickOnLoginButtonInLoginPage() {
        webApp.dashboard = webApp.login.clickOnLoginButton();
    }

    @Then("user should be redirected to dashboard page with title {string}")
    public void userShouldBeRedirectedToDashboardPageWithTitle(String title) {
        Assert.assertEquals(webApp.dashboard.getDashboardTitle().getText(), title);
    }

    @When("click on admin icon in dashboard page")
    public void clickOnAdminIconInDashboardPage() {
        webApp.admin = webApp.dashboard.clickOnAdminButton();
    }

    @When("click on add button in admin page")
    public void clickOnAddButtonInAdminPage() {
        webApp.admin.getAddButton().click();
    }

    @When("select Role Option {string} in admin page")
    public void selectRoleOptionInAdminPage(String role) {
        webApp.admin.selectRoleOption(role);
    }

    @When("enter Employee {string} in admin page")
    public void enterEmployeeInAdminPage(String name) {
        webApp.admin.getEmployeeName().sendKeys(name);
        webApp.admin.getRightSuggestion(name).click();


    }

    @When("select status {string} in admin page")
    public void selectStatusInAdminPage(String status) {
        webApp.admin.selectStatus(status);
    }

    @When("enter new Password for credential {string} in admin page")
    public void enterNewPasswordForCredentialInAdminPage(String password) {
        webApp.admin.getNewPasswordTextBox().sendKeys(password);
    }

    @When("enter new UserName for credential {string} in admin page")
    public void enterNewUserNameForCredentialInAdminPage(String userName) {
        webApp.admin.getNewUserNameTextBox().sendKeys(userName);

    }

    @When("click on save button in admin page")
    public void clickOnSaveButtonInAdminPage() {
        webApp.admin.getSaveButton().click();
    }

    @When("enter new Password confirmation for credential {string} in admin page")
    public void enterNewPasswordConfirmationForCredentialInAdminPage(String password) {
        webApp.admin.getNewPasswordConfirmationTextBox().sendKeys(password);

    }

    @Then("success message should be displayed in admin page")
    public void successMessageShouldBeDisplayedInAdminPage() {
        webApp.admin.getSuccessMessage().isDisplayed();
    }

    @When("click on employee profile icon")
    public void clickOnEmployeeProfileIcon() {
        webApp.admin.getAccountIcon().click();
    }

    @When("click on logout option")
    public void clickOnLogOutOption() {
        webApp.login = webApp.admin.clickOnLogOutOption();

    }

    @When("click on Time Icon in dashboard page")
    public void clickOnTimeIconInDashboardPage() {
        webApp.time = webApp.dashboard.clickOnTimeButton();
    }

    @When("enter Employee name in time page {string}")
    public void enterEmployeeInTimePage(String employeeNameText) {
        webApp.time.getEmployeeName().sendKeys(employeeNameText);
        webApp.time.getEmployeeNameSuggestion(employeeNameText).click();

    }

    @When("click on view Button in time page")
    public void clickOnViewButtonInTimePage() {
        webApp.time.getViewButton().click();
    }

    @When("click on timeSheet in time page")
    public void clickOnTimeSheetInTimePage() {
        webApp.time.getTimeSheet().click();
    }

    @When("click on edit button in time page")
    public void clickOnEditButtonInTimePage() {
        webApp.time.getEditButton().click();

    }

    @Then("time sheet should be approved in time page")
    public void timeSheetShouldBeApprovedInTimePage() {
        webApp.time.getTimeSheetStatus().getText();
        Assert.assertEquals(webApp.time.getTimeSheetStatus().getText(), "Status: Approved");

    }

    @When("enter project name in time page {string}")
    public void enterProjectNameInTimePage(String project) {
        webApp.time.getProjectNameTextBox().sendKeys(project);
        webApp.time.getProjectNameSearchSuggestion(project).click();


    }

    @When("select activity from dropDown list time page {string}")
    public void selectActivityFromDropDownListTimePage(String activity) {
        //webApp.time.getAddButton().click();
        webApp.time.getActivityDropDownArrow().click();
        webApp.time.getActivitySuggestion(activity).click();
    }


    @When("enter working hours for days {string} for {int} in time page")
    public void enterWorkingHoursForDaysForInTimePage(String hours, int n) {
        for (int i = 0; i < n; i++) {
            webApp.time.getDayTextBox(i + 3).sendKeys(hours);
        }
    }


    @When("click on save button in time page")
    public void clickOnSaveButtonInTimePage() {
        webApp.time.getSaveButton().click();
    }

    @Then("total of working hours in time page should be {string}")
    public void totalOfWorkingHoursInTimePageShouldBe(String total) {
        Assert.assertEquals(webApp.time.getTotalField().getText(), total);
    }

    @When("click on submit button in time page")
    public void clickOnSubmitButtonInTimePage() {
        webApp.admin = webApp.time.clickOnSubmitButton();
    }

    @When("click on approve button in time page")
    public void clickOnApproveButtonInTimePage() {
        webApp.admin = webApp.time.clickOnApproveButton();
    }


    @When("click on Edit for user {string} in admin page")
    public void clickOnEditForUser(String name) {
        webApp.admin.getEditeButtonForUser(name).click();
    }

    @Then("invalid credential error message should be displayed in Login Page")
    public void invalidCredentialErrorMessageShouldBeDisplayedInLoginPage() {
        Assert.assertTrue(webApp.login.getErrorMessage().isDisplayed());
    }

    @Then("account with {string} successfully created in admin page")
    public void accountWithSuccessfullyCreatedInAdminPage(String name) {
        Assert.assertTrue(webApp.admin.getEditeButtonForUser(name).isDisplayed());
    }

    @When("Scroll down")
    public void scrollDown() {
    }
}
