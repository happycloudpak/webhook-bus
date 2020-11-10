package com.svcmesh;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@FeignClient( name="webhook", url="${config-server-refresh-url:http://localhost:9001/actuator}" )
public interface IWebhookController {
	@PostMapping("/bus-refresh")
	@ApiOperation(value="Refresh spring cloud bus refresh")
	public String refreshBus();
}
