package steps;


import Pojo.TextBoxPojo;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTableWithPojoStepDef {

    @DataTableType
    public TextBoxPojo convert (Map<String, String> entry ) {
        return TextBoxPojo.builder()
                .fullName(entry.get("fullName"))
                .email(entry.get("email"))
                .currentAddress(entry.get("currentAddress"))
                .permanentAddress(entry.get("permanentAddress"))
                .build();
    }
    @Given("fill up Text box form with following data")
    public void fill_up_text_box_form_with_following_data(List<TextBoxPojo> textBoxPojos) {
        textBoxPojos.forEach(System.out::println);

        System.out.println(textBoxPojos.get(0).getFullName());
        System.out.println(textBoxPojos.get(0).getEmail());
    }
}
