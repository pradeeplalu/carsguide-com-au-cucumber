package au.com.carsguide.steps;

import au.com.carsguide.pages.UsedCarsForSalePage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class UsedCarForSaleSteps {
    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        String expected = "Used Cars For Sale";
        String actual = new UsedCarsForSalePage().getTitleTextOfUsedCarsForSalePage();
        Assert.assertEquals("Used Cars For Sale Page not displayed ",expected,actual);
    }


}


