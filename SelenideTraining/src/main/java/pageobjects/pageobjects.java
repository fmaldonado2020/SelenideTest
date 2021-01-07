package pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class pageobjects {

    public SelenideElement getSearchInput(){
        return $(byXpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).should(Condition.exist).shouldBe(Condition.visible);
    }

    public SelenideElement getSearchResult(){
        return $(byXpath("//span[contains(text(),'Abba - Fernando - YouTube')]"));
    }

    public SelenideElement getSearchButton(){
        return $(byName("btnK"));
    }

}
