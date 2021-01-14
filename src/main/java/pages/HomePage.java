package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waiters.Waiter;

public class HomePage extends BasePage {
    private final Waiter wait;

    @FindBy(className = "menu-toggler")
    public WebElement productsCatalogue;

    @FindBy(css = "body > app-root > div > div:nth-child(2) > app-rz-header > header > div > div.header-bottomline > div.menu-outer.js-rz-fat-menu > fat-menu > div > ul > li.menu-categories__item.menu-categories__item_state_hovered > div > div.menu__main-cats > div.menu__main-cats-inner > div:nth-child(1) > ul:nth-child(1) > li > a")
    private WebElement laptopCategory;

    @FindBy(linkText = "Товары для геймеров")
    private WebElement productForGamersCategory;

    @FindBy(xpath = "(//span[@class='popular-category__title'])[1]")
    private WebElement playstationStoreCategory;

    @FindBy(xpath = "//a[@class='header-actions__button header-actions__button_type_wish header-actions__button_state_active']")
    private WebElement activeHeaderWishListButton;

    @FindBy(xpath = "(//button[@class='header-actions__button header-actions__button_type_compare header-actions__button_state_active'])")
    private WebElement activeHeaderComparisonButton;

    @FindBy(xpath = "//ul[@class='comparison-modal__list']")
    private WebElement comparisonList;

    @FindBy(xpath = "//*[@class='button--link header-cities__label']")
    private WebElement chooseCity;

    @FindBy(xpath = "//a[@class='header-location__popular-link']")
    private WebElement listOfCities;

    @FindBy(xpath = "//button[@class='button button_size_medium button_color_green']")
    private WebElement acceptButtonToChooseCity;

    @FindBy(name = "search")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='button button_color_green button_size_medium search-form__submit']")
    public WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
        wait = new Waiter(driver);
        PageFactory.initElements(driver, this);
    }

    public String chooseCityGetText() {
        wait.untilVisible(chooseCity);
        return chooseCity.getText();
    }

    public String searchFieldGetText() {
        wait.untilVisible(searchField);
        return chooseCity.getText();
    }

    public void navigateToCategoriesFromMainPage() {
        wait.untilVisible(productsCatalogue).click();
    }

    public void navigateToLaptopCategory() {
        wait.untilVisible(laptopCategory).click();
    }
    public boolean navigateToLaptopCategory11111() {
        wait.untilVisible(laptopCategory).getCssValue("menu-categories");
        return true;
    }

    public void productForGamersCategoryClick() {
        wait.untilVisible(productForGamersCategory).click();
    }

    public void playstationCategoryClick() {
        wait.untilVisible(playstationStoreCategory).click();
    }

    public void activeHeaderWishListButtonClick() {
        wait.untilVisible(activeHeaderWishListButton).click();
    }

    public void activeHeaderComparisonButtonClick() {
        wait.untilVisible(activeHeaderComparisonButton).click();
    }

    public void comparisonListClick() {
        wait.untilVisible(comparisonList).click();
    }

    public void chooseCityClick() {
        wait.untilVisible(chooseCity).click();
    }

    public void chooseCityFromListOfCitiesClick() {
        wait.untilVisible(listOfCities).click();
    }

    public void acceptButtonToChooseCityClick() {
        wait.untilVisible(acceptButtonToChooseCity).click();
    }

    public void inputSearchField() {
        wait.untilVisible(searchField).click();
        wait.untilVisible(searchField).sendKeys("Ноутбук");
    }

    public void clear() {
        searchField.clear();
    }

    public void searchButtonClick() {
        wait.untilVisible(searchButton).submit();
    }
}

