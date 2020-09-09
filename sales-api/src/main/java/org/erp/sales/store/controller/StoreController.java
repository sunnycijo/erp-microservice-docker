package org.erp.sales.store.controller;

import org.erp.sales.store.service.StoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/v1")
public class StoreController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StoreService storeService;

	@PostMapping("/sell")
	public ResponseEntity<?> sellItem() {
		logger.info("Selling item");
		return ResponseEntity.ok(storeService.sellItem());
	}
}
