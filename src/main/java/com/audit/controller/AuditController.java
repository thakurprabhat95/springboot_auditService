package com.audit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audit.entity.Audit;
import com.audit.service.AuditService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/audit")
public class AuditController {

	
	//create logger object
	private static final Logger logger = LoggerFactory.getLogger(AuditController.class);
	
	//inject auditService
	@Autowired
	private AuditService auditService;

	@PostMapping("/saveAudit")
	@ApiOperation(value = "/saveAudit", notes="create audit",tags = {"audit service"})
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "audit data created successfully"),
			@ApiResponse(code = 404, message = "Invalid data"),
			@ApiResponse(code = 500, message = "Internal server error") })
	
	public Audit saveAudit(@RequestBody Audit audit) {
		logger.info("this is  saveAudit() controller...");
		return auditService.saveAudit(audit);
	}

	@GetMapping("/getaudit/{id}")
	@ApiOperation(value = "/getaudit/{id}", notes="get audit using id",tags = {"audit service"})
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "audit data "),
			@ApiResponse(code = 404, message = "Invalid data"),
			@ApiResponse(code = 500, message = "Internal server error") })
	private Audit findAudit(@PathVariable("id") long auditId) {

		logger.info("this is findAudit() method...");
		return auditService.findAudit(auditId);
	}

}
