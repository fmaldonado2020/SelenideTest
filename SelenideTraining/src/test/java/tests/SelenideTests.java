package tests;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.pageobjects;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideTests {
    pageobjects oObjects;
    @BeforeClass
    public void beforeClass(){
        open("https://www.google.com/");
        getWebDriver().manage().window().maximize();
        oObjects = new pageobjects();
    }

    @AfterClass
    public void afterClass(){
        getWebDriver().quit();
        Selenide.closeWebDriver();
    }

    @Test
    public void selenideTest(){
        oObjects.getSearchInput().setValue("Fernando");
        oObjects.getSearchButton().click();
        oObjects.getSearchResult().shouldHave(Condition.text("Abba - Fernando - YouTube"));
    }
}
