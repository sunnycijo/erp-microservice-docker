package org.erp.customer.info.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info/v1")
public class CustomerInfoController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/idfromphone")
	public String getCustomerIdFromPhoneNumber() {
		logger.info("In Id from Phone");
		return "1234";
	}
}
