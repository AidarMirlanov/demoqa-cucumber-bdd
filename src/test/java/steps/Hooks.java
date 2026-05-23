package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

public class Hooks {
    @Before(order = 1)
    public void setUpAllureSelenide () {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
                .includeSelenideSteps(true));
    }

    @Before(order = 0)
    public void setUp () {
        Configuration.headless = false;
    }
    @After(order = 0)
    public void tearDownAllure () {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }

}
