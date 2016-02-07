package jp.uich;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("demoservice")
public interface DemoServiceClient {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	String getPort();
}
