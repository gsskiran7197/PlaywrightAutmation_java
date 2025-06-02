package Basics;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class Multiple_pages_with_browser_context {

    @Test
    public void multiplePagesWithBrowserContext(){
        Playwright playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        BrowserContext browserContext1 = browser.newContext();

        Page page = browserContext.newPage();
        Page page1 = browserContext1.newPage();

        page.navigate("https://apple.com");
        page1.navigate("https://in.linkedin.com/");

        System.out.println(page.title());
        System.out.println(page1.title());
    }
}
