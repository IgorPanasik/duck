package Page;
import com.codeborne.selenide.Configuration;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;


import static com.codeborne.selenide.Selenide.*;


public class TestBase {

    protected static Logger logger = Logger.getLogger(TestBase.class);

    @BeforeMethod
    public void setup(){
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 15000;

        Configuration.browser = "CHROME";
        Configuration.baseUrl = "https://litecart.stqa.ru/en/";
        open(Configuration.baseUrl);
    }


}