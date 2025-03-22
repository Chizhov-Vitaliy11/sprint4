package practikum.test;

import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import practikum.pom.MainPage;
import practikum.rules.BrowserRule;
import practikum.steps.Steps;

import javax.swing.text.Element;
import java.util.List;

import static org.junit.Assert.*;

public class ListImportantQuestionsTest {

    private WebDriver driver;
    @Rule
    public final BrowserRule browserRule = new BrowserRule();
    @Test
    public void checkList() {



        Steps steps = new Steps(browserRule.getWebDriver());
        MainPage mainPage = new MainPage();
        steps.openSait(mainPage.getUrl());


        List<WebElement> ItemHeadings = browserRule.getWebDriver().findElements(mainPage.getItemHeadings()); // Список заголовок
        List<WebElement> ItemPanels = browserRule.getWebDriver().findElements(mainPage.getItemPanels()); // Список панелей



        // Перебор всего списка "Вопросы о важном"
        for (int i = 0; i < ItemHeadings.size(); i++) {

            System.out.println("Click " + ItemHeadings.get(i).getAttribute("id"));

            steps.click(By.id(ItemHeadings.get(i).getAttribute("id")));

            System.out.println("Wait " + ItemPanels.get(i).getAttribute("id"));

            steps.wait(By.id(ItemPanels.get(i).getAttribute("id")),10);

            System.out.println("Check " + ItemPanels.get(i).getAttribute("id"));

            System.out.println(ItemPanels.get(i).getAttribute("hidden"));

            assertNull("Не показало или показан не тот текст", ItemPanels.get(i).getAttribute("hidden"));

        }


    }


}