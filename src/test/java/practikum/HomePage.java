package practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.hamcrest.CoreMatchers.is;

public class HomePage {

    private WebDriver driver;
    private final By itemHeadings = By.xpath(".//div[contains(@id,'accordion__heading')]"); // Заголовки
    private final By itemPanels = By.xpath(".//div[contains(@id,'accordion__panel')]"); // Содержание
    private final By accordion =  By.xpath(".//div[@class='accordion']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    // Нажатие на заголовок по индексу
    public void clickItemHeading(int index) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement( By.id("accordion__heading-"+index)));
///        driver.findElement().click();
        //driver.findElements(itemHeadings).get(index).click();
    }

    // Получить локатор заголовков
    public By getItemHeadings() {
        return itemHeadings;
    }

    public By getAccordion() {
        return accordion;
    }

    public void scrollToElement (WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", element);

    }
    public void waitShowHeading(int index){

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(
                By.id("accordion__heading-"+index+"")
        ));
    }
    public void waitShowPanel(int index){

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(
                By.id("accordion__panel-"+index+"")
        ));
    }

    // Получить локатор панелей
    public By getItemPanels() {
        return itemPanels;
    }
}