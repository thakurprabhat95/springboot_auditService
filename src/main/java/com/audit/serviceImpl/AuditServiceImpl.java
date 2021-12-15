package com.audit.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audit.entity.Audit;
import com.audit.repository.AuditRepository;
import com.audit.service.AuditService;

@Service
public class AuditServiceImpl implements AuditService{
	
	@Autowired
	private AuditRepository auditRepository;

	@Override
	public Audit saveAudit(Audit audit) {
		return auditRepository.save(audit);
	}

	@Override
	public Audit findAudit(long auditId) {
		
	return  auditRepository.findByAuditId(auditId);
	}

	

	

	
}
