package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class LoginSwagLabsSteps {
    LoginScreen loginScreen;
//    SearchScreen searchScreen;
//    SearchDetailsScreen searchDetailsScreen;

    @Step
    public void loginCorrect(String user, String password){
        loginScreen.loginUserAndPassword(user,password);
    }

//    @Step("Búsqueda por texto {0}")
//    public void searchByText(String place){
//        searchScreen.clickSearchInput();
//        searchDetailsScreen.enterSearchInput(place);
//        searchDetailsScreen.clickFirstOption();
//        searchDetailsScreen.clickNext();
//        searchDetailsScreen.clickSearch();
//    }
//
//    @Step("Obtiene el texto del resultado")
//    public String getResultText(){
//        return searchScreen.getResultText();
//    }
}
