package tests;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideTests {
    @BeforeClass
    public void beforeClass(){
        open("");
        getWebDriver().manage().window().maximize();
    }

    @AfterClass
    public void afterClass(){

    }
}
