import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class CredentialTest
{

    @Test
    public void testCredentials() {
        final CredentialsConfig config = ConfigFactory
                .create(CredentialsConfig.class,System.getProperties());

        System.out.println(config.username());
        System.out.println(config.password());
    }
}
