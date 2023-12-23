package tests;

import pages.SubscribePage;
import org.testng.annotations.Test;

public class SubscribeTest extends BaseTest {

    @Test
    public void validateSubscriptionPackages() {
        // Create a SubscribePage instance and perform validations
        SubscribePage subscribePage = new SubscribePage(driver);
        subscribePage.navigateTo("https://subscribe.stctv.com/");
        subscribePage.selectCountryAndValidateSubscription("eg"); //select Egypt
        subscribePage.selectCountryAndValidateSubscription("ae"); //select UAE
        subscribePage.selectCountryAndValidateSubscription("dz"); //select Algeria
    }
}
