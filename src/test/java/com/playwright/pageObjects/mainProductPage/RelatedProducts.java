package com.playwright.pageObjects.mainProductPage;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class RelatedProducts {

    private Page page;
    private Locator relatedProducts;
    private Locator bestSellerProducts;

    public RelatedProducts(Page page) {
        this.page = page;
        this.relatedProducts = page.locator("#placement101875");
        this.bestSellerProducts = page.locator(".uV_m NSYw RbHSS");
    }

    public boolean isRelatedProductVisible() {
        return relatedProducts.isVisible();
    }

    public int getBestSellerProductsCount(){
//        List<String> productNames = bestSellerProducts.allTextContents();
        return bestSellerProducts.count();
    }


//    public List<ProductSummary> getProductSummaries() {
//        return page.locator(".card").all()
//                .stream()
//                .map(productCard -> {
//                    String productName = productCard.getByTestId("product-name").textContent().strip();
//                    String productPrice = productCard.getByTestId("product-price").textContent();
//                    return new ProductSummary(productName, productPrice);
//                }).toList();
//    }
//
//    public void sixProductsShouldBeDisplayed(List<ProductSummary> expectedProductCount) {
//        List<ProductSummary> matchingProducts = relatedProducts.getProductSummaries();
//        Assertions.assertThat(matchingProducts).containsExactlyInAnyOrderElementsOf(expectedProductSummaries);
//    }
}
