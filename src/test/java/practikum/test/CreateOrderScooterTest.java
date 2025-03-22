package practikum.test;

import org.junit.Rule;
import org.junit.Test;
import practikum.pom.FormCreateOrderPage;
import practikum.pom.MainPage;
import practikum.rules.BrowserRule;
import practikum.steps.Steps;

public class CreateOrderScooterTest {

    @Rule
    public final BrowserRule browserRule = new BrowserRule();

    @Test
    public void checkModalWindowSuccessCreateOrder() {

        Steps steps = new Steps(browserRule.getWebDriver());
        MainPage mainPage = new MainPage();
        steps.openSait(mainPage.getUrl());
        steps.click(mainPage.getButtonsToOrder());
        FormCreateOrderPage formCreateOrderPage = new FormCreateOrderPage();
//        Ожидание поле Фамилия
        steps.wait(formCreateOrderPage.getInputSecondName(), 5);

        //        Ввод поля Фамилия
        steps.sendKey(formCreateOrderPage.getInputSecondName(), "Кек", "value");
        //        Ввод поля Имени
        steps.sendKey(formCreateOrderPage.getInputName(), "Кек", "value");
        //        Ввод поля Адрес
        steps.sendKey(formCreateOrderPage.getInputAddress(), "лплпл", "value");
        System.out.println(formCreateOrderPage.getInputMetro());
        //        Нажатие на поле "Станция метро"
        steps.click(formCreateOrderPage.getInputMetro());


 steps.sendKey(formCreateOrderPage.getInputMetro(), "Севастопольская", "value");


//       Ожидание появления полного списка
        steps.wait(formCreateOrderPage.getListMetro(), 30);
        //        Скролл списка поля "Станция метро"
        steps.scroll(formCreateOrderPage.getListMetro());
       //

        System.out.println(steps.elementFromTheList(formCreateOrderPage.getListMetro()));
//
        steps.click(formCreateOrderPage.getListMetro());


        steps.sendKey(formCreateOrderPage.getInputPhone(), "799999999999", "value");

        steps.click(formCreateOrderPage.getButtonNext());
        steps.wait(formCreateOrderPage.getInputWhen(), 10);





//        steps.sendKey(formCreateOrderPage.getInputWhen(), "31.03.2025","value");
//        steps.sendKey(formCreateOrderPage.getInputPeriodRental(), "двое суток", "innerText");
    }


}
//