package com.playwright.functionalTests.stepDefitions;

import com.microsoft.playwright.Page;
import com.playwright.functionalTests.cucumberFixtures.PlaywrightCucumberFixtures;
import com.playwright.pageObjects.mainProductPage.RelatedProducts;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class RelatedProductSteps {

    RelatedProducts relatedProducts;

    @Before
    public void setupPageObjects() {
        relatedProducts = new RelatedProducts(PlaywrightCucumberFixtures.getPage());
    }

    @Then("user should be able to see related product")
    public void user_should_be_able_to_see_related_product() {
        Assertions.assertThat(relatedProducts.isRelatedProductVisible());
    }

    @Then("user should be able to see Maximum {int} products appear in the related best seller section")
    public void user_should_be_able_to_see_maximum_products_appear_in_the_related_best_seller_section(int count) {
        assertThat(relatedProducts.getBestSellerProductsCount()).isEqualTo(count);
    }
}
