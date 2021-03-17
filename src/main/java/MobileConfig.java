import org.aeonbits.owner.Config;

@Config.Sources("classpath:${platform}.properties")
public interface MobileConfig extends Config {

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

    @Key("application.location")
    String applicationLocation();
}
