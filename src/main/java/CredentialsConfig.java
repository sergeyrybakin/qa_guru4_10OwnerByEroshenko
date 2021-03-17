import org.aeonbits.owner.Config;

@Config.Sources({
        "file:~/w/qa_guru_2021/10/credentials.properties",
        "classpath:credentials.properties"
})
public interface CredentialsConfig   extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();
}
