package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubscribePage extends BasePage {

    // Locators
    private By countryButton = By.id("country-btn");
    private By typeLabel = By.className("plan-title");
    private By priceLabel = By.className("price");
    private By currencyLabel = By.cssSelector(".currency-label");

    public SubscribePage(WebDriver driver) {
        super(driver);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void selectCountryAndValidateSubscription(String country) {
        WebElement countryButtonElement = driver.findElement(countryButton);
        countryButtonElement.sendKeys(country);

        // Perform validations based on type, price, and currency
        String type = driver.findElement(typeLabel).getText();
        String price = driver.findElement(priceLabel).getText();
        String currency = driver.findElement(currencyLabel).getText();

        // Print or log the results
        System.out.println("Country: " + country);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Currency: " + currency);
        System.out.println();
    }
}

