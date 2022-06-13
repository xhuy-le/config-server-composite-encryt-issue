package configserver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigServerApplicationTests {

    @Value("${server.port}")
    int port;

    ConfigServerApplicationTests() {
        super();
    }

    @Test
    void contextLoads() {
        assertEquals(8888, port);
    }
}
