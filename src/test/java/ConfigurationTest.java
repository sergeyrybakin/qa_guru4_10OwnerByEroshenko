import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Disabled
public class ConfigurationTest
{
    @Test
    public void testConfiguration(){
        final WebDriverConfig cfg = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(cfg.getWebDriverUrl()).isEqualTo("http://localhost:4444");
        assertThat(cfg.getWebDriverBrowser()).isEqualTo("chrome");
        assertThat(cfg.getBaseUrl()).isEqualTo("https://testing.github.com");
        assertThat(cfg.isEnabled()).isEqualTo(true);
    }
}
