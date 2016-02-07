package jp.uich;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Value("${server.port}")
	String serverPort;

	@RequestMapping("/get")
	public String get() {
		return serverPort;
	}
}
