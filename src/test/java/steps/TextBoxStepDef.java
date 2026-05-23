package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxStepDef {
    @Given("user is on Text box on page")
    public void user_is_on_text_box_on_page() {
        Selenide.open("https://demoqa.com/text-box");
        SelenideElement element = $(By.id("userName")).shouldBe(Condition.visible, Duration.ofSeconds(30));

    }
    @Given("user enter full name")
    public void user_enter_full_name() {
        $(By.id("userName")).sendKeys("John Doe");
    }
    @Given("user enter email")
    public void user_enter_email() {
        $(By.id("userEmail")).sendKeys("John@gmail.com");

    }
    @Given("user enter current address")
    public void user_enter_current_address() {
        $(By.id("currentAddress")).sendKeys("Ochen horoshiy address");

    }
    @Given("user enter permanent address")
    public void user_enter_permanent_address() {
        $(By.id("permanentAddress")).sendKeys("Ochen horoshiy address 2");

    }
    @When("user click submit button")
    public void  user_click_submit_button() {
        $(By.id("submit")).scrollTo().click();

    }
    @Then("user should successfully fill up the form")
    public void user_should_successfully_fill_up_the_form() {


    }

    @Given("user enter {string} in full name")
    public void user_enter_in_full_name(String userFullName) {
        System.out.println(userFullName);

    }
    @Given("user enter {string} in email")
    public void user_enter_in_email(String email) {
        System.out.println(email);

    }
    @Given("user enter {string} in current address")
    public void user_enter_in_current_address(String address) {
        System.out.println(address);

    }
    @Given("user enter {string} in permanent address")
    public void user_enter_in_permanent_address(String address) {
        System.out.println(address);

    }
}

