package pl.glizniewicz.intellijtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class name ending with 'IT', matching the default
 * <a href="https://maven.apache.org/surefire/maven-failsafe-plugin/integration-test-mojo.html#includes">Failsafe Plugin</a>
 * configuration.
 */
@SpringBootTest
public class IntellijtestApplicationIT {

    @Test
    void contextLoads() {
        // given surefire configuration

        // when
        assertThat(System.getProperty("testProperty"))

                // then
                .isEqualTo("failsafe");
    }
}
