package Basics;

import com.microsoft.playwright.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class chromium {

    @Test
    public void chromium(){
        Playwright playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();

        page.navigate("https://apple.com/");


        String expected = "Apple";
        Assert.assertEquals(page.title(), expected,"successfully failed");
        System.out.println(page.title());
    }


    @Test
    public void firstProgram(){

        Playwright playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();

//        Page page = Playwright.create().chromium().launch().newContext().newPage();

        page.navigate("https://in.linkedin.com/");
        String expected = "LinkedIn India: Log In or Sign Up";
        Assert.assertEquals(page.title(), expected,"successfully failed");

        System.out.println(page.title());
    }
}
