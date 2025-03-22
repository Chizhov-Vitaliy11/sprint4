package practikum.pom;

import org.openqa.selenium.By;

public class FormCreateOrderPage {
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");
    private final By inputSecondName = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
// поле "Станция метро"
   private final By inputMetro = By.xpath(".//input[@class='select-search__input' and @placeholder='* Станция метро']");

   //private final By listMetro= By.xpath(".//button[contains(@class,'Order_SelectOption') and @value=1]");
// Список станции метро
   private final By listMetro= By.xpath(".//*[@value='170']");

    private final By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By inputWhen = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By inputPeriodRental = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final  By selectSearchMetro=  By.xpath(".//div[@class='select-search__value']") ;
    // private final By listPeriodRental =By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By checkboxColorScooter = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By buttonNext = By.xpath(".//button[contains(@class,'Button_Button') and text()='Далее']");

    public By getButtonNext() {
        return buttonNext;
    }

    public By getSelectSearchMetro() {
        return selectSearchMetro;
    }

    public By getListMetro(){
        return listMetro;
}
    public By getInputPeriodRental() {
        return inputPeriodRental;
    }

    public By getCheckboxColorScooter() {
        return checkboxColorScooter;
    }

    public By getInputAddress() {
        return inputAddress;
    }

    public By getInputComment() {
        return inputComment;
    }

    public By getInputMetro() {
        return inputMetro;
    }

    public By getInputName() {
        return inputName;
    }

    public By getInputPhone() {
        return inputPhone;
    }

    public By getInputSecondName() {
        return inputSecondName;
    }

    public By getInputWhen() {
        return inputWhen;
    }
}

