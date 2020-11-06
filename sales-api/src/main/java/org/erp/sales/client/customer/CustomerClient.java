package org.erp.sales.client.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "customer-api")
@FeignClient(name = "edge-server-api")
public interface CustomerClient {
//	@GetMapping("/info/v1/idfromphone")
	@GetMapping("/customer-api/info/v1/idfromphone")
	public String getCustomerIdFromPhone();
}
