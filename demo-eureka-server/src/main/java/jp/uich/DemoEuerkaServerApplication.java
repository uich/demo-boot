package jp.uich;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEuerkaServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoEuerkaServerApplication.class)
			.web(true)
			.run(args);
	}
}
