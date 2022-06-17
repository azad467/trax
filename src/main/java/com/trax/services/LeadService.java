package com.trax.services;

import java.util.List;

import com.trax.entities.Lead;

public interface LeadService {
	public void saveLeadInfo(Lead lead);

	public Lead findLeadById(Long id);

	public void deleteLeadById(Long id);
	public List<Lead> getAllLeads();
}
