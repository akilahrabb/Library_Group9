package com.library.step_definitions;

import io.cucumber.java.en.Then;
import java.util.List;

public class bookSearch_stepDefinitions {


    @Then("user sees the categories below")
    public void userSeesTheCategoriesBelow(List<String> category) {
        for (String each: category    ) {
            System.out.println("User sees" + each);
        }
    }
}
