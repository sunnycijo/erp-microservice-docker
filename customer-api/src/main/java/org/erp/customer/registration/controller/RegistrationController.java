package org.erp.customer.registration.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration/v1")
public class RegistrationController {
	@Value("${customer.registration.enabled}")
	private Boolean isRegistrationEnabled;
	
	@PostMapping("/customer")
	public ResponseEntity<?> registerCustomer() {
		if (isRegistrationEnabled)
			return ResponseEntity.ok("Registered");
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Cannot register now");
	}
}
