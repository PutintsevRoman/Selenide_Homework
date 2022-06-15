package gittest;



import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public MainPage openPage() {
        open("selenide/selenide");
        return this;
    }

    public MainPage openWiki(){
        $("#wiki-tab").click();
        return this;
    }
    public MainPage morePage(){
        $("li.wiki-more-pages-link").$("button").click();
        return this;
    }
    public MainPage changePage(String value){
        morePage();
        $$("li.Box-row").filterBy(text(value)).first().shouldBe(visible).click();
        return this;
    }
    public MainPage findJUnit ()
    {
        $$("h4").filterBy(text("JUnit5"))
                .first().sibling(0).shouldHave(text("@ExtendWith({SoftAssertsExtension.class}"));
        return this;
    }

}
