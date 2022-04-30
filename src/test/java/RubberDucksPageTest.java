import Helper.Listener;
import Page.RubberDucksPage;
import Page.TestBase;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

import static Page.RubberDucksPage.locatorYellowDuck;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners({Listener.class})
public class RubberDucksPageTest extends TestBase {

    @Epic(value = "Duck-site")
    @Feature(value = "Check duck")
    @Story(value = "Color and Sticker")
    @Test
    public void duckSubcategoryTest() throws InterruptedException {

        int result = 0;

        result = RubberDucksPage.duckSubcategory();
        assertTrue((result == 3), String.format("Result= %s expRes = 3", result));
    }

    @Epic(value = "Duck-site")
    @Feature(value = "Check duck")
    @Story(value = "Name")
    @Test
    public void duckSortNameTest() {

        ArrayList<String> nameSort;
        ArrayList<String> name;
        logger.info("Start test duckSortNameTest");
        name = RubberDucksPage.duckSortName();
        nameSort = (ArrayList) name.clone();

        Collections.sort(nameSort);
        assertTrue(name.equals(nameSort), String.format("Exp: %s Res: %s", nameSort, name));
        logger.info(String.format("ExpName: %s \n ActualName: %s", nameSort, name));
    }


    @Epic(value = "Duck-site")
    @Feature(value = "Check duck")
    @Story(value = "Price")
    @Test
    public void duckSortPriceTest() {

        ArrayList<Float> priceSort;
        ArrayList<Float> price;
        price = RubberDucksPage.duckSortPrice();
        priceSort = (ArrayList) price.clone();
        Collections.sort(priceSort);
        logger.info(String.format("ExpName: %s \n ActualName: %s", priceSort, price));
        assertTrue(price.equals(priceSort), String.format("Exp: %s Res: %s", priceSort, price));
    }

    @Epic(value = "Duck-site")
    @Feature(value = "Check duck")
    @Story(value = "Sticker")
    @Test
    public void duckNewLabelTest() {
        int[] Result = new int[2];
        Result = RubberDucksPage.duckNewLabel();
        assertTrue(Result[0] == Result[1], String.format("Exp: %s Res: %s ", Result[0], Result[1]));
        logger.info(String.format("ExpLabel: %s ActualLabel: %s", Result[0], Result[1]));
    }
    @Test
    public void findElementSaleRubberDucksTest() {
        String expectedString = RubberDucksPage.getAccessibility(locatorYellowDuck);
        boolean result = expectedString.toLowerCase().contains("Yellow Duck".toLowerCase()) &&
                expectedString.toLowerCase().contains("SALE".toLowerCase());
        Assert.assertTrue(result,"");
        logger.info("INFO findElementSaleRubberDucksTest");
        logger.info(String.format("%s",expectedString));
    }

}