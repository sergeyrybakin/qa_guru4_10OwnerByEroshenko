import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {

    @Test
    public void testFruits() {
        final FruitsConfig fruitsConfig = ConfigFactory
                .create(FruitsConfig.class,System.getProperties());
        assertThat(fruitsConfig.getFruits())
                .containsExactlyInAnyOrder("apple","banana","orange");
    }

}
