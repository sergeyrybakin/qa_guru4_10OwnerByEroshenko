import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class GlobalConfigTest {

    @Test
    public void testGlobalConfig() {
        final GlobalConfig globalConfig = ConfigFactory
                .create(GlobalConfig.class,System.getProperties());

        final Proxy proxy = globalConfig.getProxy();

        assertThat(proxy.host).isEqualTo("proxy.company.com");
        assertThat(proxy.port).isEqualTo(4444);
    }
}
