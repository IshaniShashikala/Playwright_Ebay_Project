package com.playwright.fixtures;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.AfterEach;

public interface TakeFinalscreenshot {

    @AfterEach
    default void takeScreenshot(Page page)  {
        ScreenshotManager.takeScreenshot(page, "Final screenshot");
    }
}
