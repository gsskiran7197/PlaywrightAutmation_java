package Basics;

import com.microsoft.playwright.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class First_Playwright_Program {

    @Test
    public void firstProgram(){

        Playwright playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch();
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();

//        Page page = Playwright.create().chromium().launch().newContext().newPage();

        page.navigate("https://playwright.dev/java/");
        String expected = "Playwright Java";
        Assert.assertEquals(page.title(), expected,"successfully failed");

        System.out.println(page.title());
    }
}
