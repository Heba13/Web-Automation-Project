package webApp.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webApp.driver.WebDriverConfig;
import java.time.Duration;

public class BasePage {
    public WebElement findElement(By locator) {
        WebDriverWait wait = new WebDriverWait(WebDriverConfig.getWebDriver(), Duration.ofSeconds(50));
        System.out.println(locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return WebDriverConfig.getWebDriver().findElement(locator);

    }

    public void scrollPageToElement(WebElement element) {
        Actions actionProvider = new Actions(WebDriverConfig.getWebDriver());
        actionProvider.moveToElement(element);
        actionProvider.perform();
}}

