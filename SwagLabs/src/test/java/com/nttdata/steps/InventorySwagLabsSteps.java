package com.nttdata.steps;

import com.nttdata.screens.InventoryScreen;
import net.thucydides.core.annotations.Step;

public class InventorySwagLabsSteps {
    InventoryScreen inventoryScreen;
    @Step
    public String getTitleText(){
        return inventoryScreen.getTextTitle();
    }

    @Step
    public String getItemName(){
        return inventoryScreen.getItemName();
    }
}

