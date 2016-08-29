package io.github.kuyer.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SqlReport服务启动
 * @author rory.zhang
 */
@SpringBootApplication
@ComponentScan(basePackages="io.github.kuyer.config")
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

}
