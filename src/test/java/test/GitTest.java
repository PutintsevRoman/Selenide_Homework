package test;

import gittest.MainPage;
import org.junit.jupiter.api.Test;

public class GitTest extends TestBase{

    MainPage mainPage = new MainPage();

    @Test
    public void gitTest(){
        mainPage.openPage()
                .openWiki()
                .changePage("SoftAssertions")
                .findJUnit();
    }

}
