package com.audit.service;

import com.audit.entity.Audit;

public interface AuditService {

	Audit saveAudit(Audit audit);
	Audit findAudit(long auditId);

}
