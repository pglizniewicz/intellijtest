package pl.glizniewicz.intellijtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class name ending with 'Tests', matching the default
 * <a href="https://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html#includes">Surefire Plugin</a>
 * configuration.
 */
@SpringBootTest
class IntellijtestApplicationTests {

    @Test
    void contextLoads() {
        // given surefire configuration

        // when
        assertThat(System.getProperty("testProperty"))

                // then
                .isEqualTo("surefire");
    }

}
