package test;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GragAndDrop extends TestBase{

    @Test
    public void firstTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
    }
}
