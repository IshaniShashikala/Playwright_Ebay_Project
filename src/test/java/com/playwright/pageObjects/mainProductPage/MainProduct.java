package com.playwright.pageObjects.mainProductPage;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.playwright.utils.Global_Vars;

public class MainProduct  {

    private Page page ;
    private Locator mainProduct;

    public MainProduct(Page page) {
        this.page = page;
        this.mainProduct = page.locator(".ux-image-carousel zoom img-transition-medium");
    }

    public void navigateTo_MainProduct_page(){
        page.navigate(Global_Vars.MAIN_PRODUCT_URL + "/325169356706?itmmeta=01KKB909B7EEDKJW6JJJD26SDP&hash=item4bb59a9fa2:g:m5YAAOSw5RNg4BA~");
    }

    public boolean isMainProductVisible() {
        return mainProduct.isVisible();
    }
}
