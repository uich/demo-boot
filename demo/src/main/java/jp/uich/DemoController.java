package jp.uich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

	@Autowired
	private HogeConfig config;

	@RequestMapping("/get/config")
	public String hello() {
		return config.getHoge().toUpperCase();
	}

	@Autowired
	DemoServiceClient demoServiceClient;
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/get/back/port")
	//	@HystrixCommand(fallbackMethod = "getBackPortFallback")
	public String getBackPort() {
		return demoServiceClient.getPort();
		//		return restTemplate.getForObject("http://demoservice/get", String.class);
	}

	public String getBackPortFallback() {
		return "エラーだよ";
	}
}
