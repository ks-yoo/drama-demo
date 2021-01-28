/* 
 COPYRIGHT (c) NEXTREE Inc. 2014
 This software is the proprietary of NEXTREE Inc.
 @since 2014. 6. 10.
*/
package io.naradrama.demo;

import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import io.naraplatform.envoy.config.NaraDramaApplication;
import io.naraplatform.daysman.daysboy.config.EnableDaysman;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.lang.String;
import org.springframework.boot.SpringApplication;

@EnableSwagger2
@EnableDaysman
@SpringBootApplication(scanBasePackages = { "io.naradrama.demo" }, exclude = MongoAutoConfiguration.class)
@EnableJpaRepositories(basePackages = { "io.naradrama.demo", "io.naraplatform.daysman.daysboy.store.jpa" })
@EntityScan(basePackages = { "io.naradrama.demo", "io.naraplatform.daysman.daysboy.store" })
public class DemoBootApplication {
    /* Autogen by nara studio */

    public static void main(String[] args) {
        /* Autogen by nara studio */
        SpringApplication.run(DemoBootApplication.class, args);
    }
}
