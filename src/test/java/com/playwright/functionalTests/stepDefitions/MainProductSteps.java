package com.playwright.functionalTests.stepDefitions;

import com.playwright.functionalTests.cucumberFixtures.PlaywrightCucumberFixtures;
import com.playwright.pageObjects.mainProductPage.MainProduct;
import com.playwright.pageObjects.mainProductPage.RelatedProducts;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class MainProductSteps {

    MainProduct mainProduct;

    @Before
    public void setupPageObjects() {
        mainProduct = new MainProduct(PlaywrightCucumberFixtures.getPage());

    }

    @Given("user navigates the main product web page")
    public void user_navigates_the_main_product_web_page() {
        mainProduct.navigateTo_MainProduct_page();
    }

    @Then("user should be able to see main product")
    public void user_should_be_able_to_see_main_product() {
        Assertions.assertThat(mainProduct.isMainProductVisible());
    }

}
