import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProxyTest {

    @Test
    public void testProxy() {
        final ProxyConfig proxyConfig = ConfigFactory
                .create(ProxyConfig.class,System.getProperties());
        assertThat(proxyConfig.host()).isEqualTo("proxy.company.com");
        assertThat(proxyConfig.port()).isEqualTo(4444);
        assertThat(proxyConfig.enabled()).isEqualTo(true);

    }
}
