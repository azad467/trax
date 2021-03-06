package com.trax.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Billing;
import com.trax.entities.Contact;
import com.trax.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
	}

	@Override
	public Billing findContactById(long id) {
		Optional<Billing> findById = billingRepo.findById(id);
		Billing bill = findById.get();
		return bill;
	}

	@Override
	public List<Billing> getAllBills() {
		List<Billing> bill = billingRepo.findAll();
		return bill;
	}

	

}
