import Page.HomePage;
import Page.TestBase;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePageTest extends TestBase {

    @Epic(value = "Duck-site")
    @Feature(value = "Check page")
    @Story(value = "Page RubberDark")

    @Test
    public void duckClickRubberDarkTest() {
        By title;
        logger.info("Start test duckClickRubberDarkTest");
        title = HomePage.duckClickRubberDark();
        $(title).shouldHave(text("Rubber Ducks"));
        logger.info("End test duckClickRubberDarkTest");
    }
    @Epic(value = "Duck-site")
    @Feature(value = "Check page")
    @Story(value = "Page DeliveryInformation")
    @Test
    public void duckClickDeliveryInformationTest() {
        ElementsCollection footer ;
        logger.info("Start test duckClickDeliveryInformationTest");
        footer = HomePage.duckClickDeliveryInformation();
        $$(footer).get(1).shouldHave(text("Delivery Information"));
    }
    @Epic(value = "Duck-site")
    @Feature(value = "Check page")
    @Story(value = "Page TermCondition")
    @Test
    public void duckClickTermConditionTest() {

        String footer = "";
        logger.info("Start test duckClickTermConditionTest");
        footer = HomePage.duckClickTermCondition();
        logger.info(String.format("TextFooter: %s ",footer));
    }
}