package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import static com.codeborne.selenide.Selenide.$x;

public class ScenarioOutlineStepDef {
    @Given("user is on HRM login page")
    public void user_is_on_hrm_login_page() {
        Selenide.open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Given("user should login with following credentials {string} {string}")
    public void user_should_login_with_following_credentials(String userName, String password) {
        $x("//input[@name='username']").sendKeys(userName);
        $x("//input[@name='password']").sendKeys(password);
        $x("//button[@type='submit']").click();

    }
}
