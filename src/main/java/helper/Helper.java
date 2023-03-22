package helper;

import base_class.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper extends BaseClass {


    public static void switchToTab(){
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).perform();
    }

    public static WebElement findLinkByText(String input){
        return driver.findElement(By.linkText(input));
    }

    public static WebElement waitForElement(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
