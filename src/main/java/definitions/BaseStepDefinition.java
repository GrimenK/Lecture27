package definitions;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import webdriver.BusinessObjectManager;
import webdriver.Driver;
import webdriver.JSONReader;
import webdriver.PageObjectManager;

public class BaseStepDefinition {
    private BusinessObjectManager boMangaer;
    private PageObjectManager pageObjectManager;


    @Given("Initialize - I am on main page Rozetka")
    public void Init_I_am_on_main_page_rozetka(){
        boMangaer = BusinessObjectManager.getInstance();
        pageObjectManager = PageObjectManager.getInstance();
        String url = JSONReader.get("url");
        Driver.createDriver();
        Driver.getWebDriver().get(url);
    }

    @And("I enter {word} search query in header searchbar")
    public void Enter_search_query_in_header(String word){
        boMangaer
                .getRozetkaMainBO()
                .enterQueryAndSearch(word);
    }

    @And("^I enter (.*) search string in header searchbar")
    public void Enter_search_string_in_header(String word){
        boMangaer
                .getRozetkaMainBO()
                .enterQueryAndSearch(word);
    }

    @And("I select {int} item on catalog")
    public void I_select_item(int index){
        boMangaer
                .getCatalogPageBO()
                .selectItemFromCatalogByIndex(--index);
    }

    @Then("Verify i am on product page")
    public void Verify_on_product_page(){
        new WebDriverWait(Driver.getWebDriver(),10).until(ExpectedConditions.visibilityOf(pageObjectManager.getItemPage().itemPageTitle));
        Assert.assertTrue(pageObjectManager.getItemPage().itemPageTitle.isDisplayed());
    }

    @Then("Verify that locating on catalog page with laptops")
    public void Verify_on_catalog_with_laptops(){
        new WebDriverWait(Driver.getWebDriver(),10).until(ExpectedConditions.visibilityOf(pageObjectManager.getCatalogPage().titlePage));
        Assert.assertTrue(pageObjectManager.getCatalogPage().titlePage.getText().equals("Ноутбуки"));
    }

}
