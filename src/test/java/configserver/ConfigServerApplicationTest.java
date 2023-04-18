package configserver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigServerApplicationTest {

    @Value("${mysecret}")
    String secret;

    @Value("${server.port}")
    int port;

    ConfigServerApplicationTest() {
        super();
    }

    @Test
    void contextLoads() {
        assertEquals("test", secret);
        assertEquals(8888, port);
    }
}
