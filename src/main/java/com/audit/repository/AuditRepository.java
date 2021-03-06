package com.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.audit.entity.Audit;

@Repository
public interface AuditRepository extends JpaRepository<Audit, Long>{


	Audit findByAuditId(long auditId);

}
