package steps;

import io.cucumber.java.en.Given;

public class BackgroundStepDef {
    @Given("user is on Practice form page")
    public void user_is_on_practice_form_page() {
        System.out.println("user is on Practice form page");
    }
    @Given("fill up the form")
    public void fill_up_the_form() {
        System.out.println("fill up the form ");
    }
    @Given("say say")
    public void say_say() {
        System.out.println("say say");
        
    }
    @Given("say")
    public void say() {
        System.out.println("say");
    }
    @Given("hello")
    public void hello() {
        System.out.println("hello");
        
    }
    @Given("bye bye")
    public void bye_bye() {
        System.out.println("bye bye");
        
    }
}
