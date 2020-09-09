package org.erp.sales.store.service;

import org.erp.sales.client.customer.CustomerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
	@Autowired
	private CustomerClient customerClient;
	public String sellItem() {
		return "Sold to "+customerClient.getCustomerIdFromPhone();
	}
}
