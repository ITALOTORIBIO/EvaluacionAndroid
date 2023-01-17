package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class InventoryScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement titleProduct;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
    private WebElement itemName;

    public String getTextTitle(){
        return titleProduct.getText();
    }

    public String getItemName(){
        return itemName.getText();
    }
}
