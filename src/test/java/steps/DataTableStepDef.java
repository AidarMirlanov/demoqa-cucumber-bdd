package steps;

import io.cucumber.java.en.Given;

import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class  DataTableStepDef {
    @Given("Fill up the form with following data")
    public void fill_up_the_form_with_following_data(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        $(By.id("userName")).sendKeys(rows.get(1).get(0));
        $(By.id("userEmail")).sendKeys(rows.get(2).get(1));
        $(By.id("currentAddress")).sendKeys(rows.get(3).get(2));
        $(By.id("permanentAddress")).sendKeys(rows.get(3).get(3));
    }
}
