package webApp.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboard extends BasePage {
    private final By dashboardTitle = By.tagName("h6");
    private final By adminButton = By.xpath("//span[normalize-space()='Admin']");
    private final By timeButton = By.xpath("//span[normalize-space()='Time']");

    public WebElement getDashboardTitle() {
        return findElement(dashboardTitle);
    }
    public Time clickOnTimeButton() {
        findElement(timeButton).click();
        return new Time();
    }
    public Admin clickOnAdminButton() {
        findElement(adminButton).click();
        return new Admin();

    }
}
