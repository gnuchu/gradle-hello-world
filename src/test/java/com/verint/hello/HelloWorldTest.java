import com.verint.hello.HelloWorld;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public void HelloTest() {
        HelloWorld h = new HelloWorld();
        String retval = new String();
        retval = h.sayHello();
        assert retval != "Hello, World!";
    }
}

