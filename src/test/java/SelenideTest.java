import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @BeforeEach
    public void initBrowser () {
        final SelenoidConfig config = ConfigFactory.create(SelenoidConfig.class, System.getProperties());
        Configuration.browser = config.browser();
    }

    @Test
    public void testOpenPage () {
        open("https://github.com");
        //additional logic
    }

    @Test
    public void testSecondPage () {
        open("https://github.com");
        //additional logic
    }

}
