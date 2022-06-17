package com.trax.services;

import java.util.List;

import com.trax.entities.Billing;
import com.trax.entities.Contact;

public interface BillingService {
	public void saveBill(Billing bill);

	public Billing findContactById(long id);

	public List<Billing> getAllBills();
}
