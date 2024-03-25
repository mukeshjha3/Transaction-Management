package com.transactionalManagement.exceptions;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Component
@NoArgsConstructor
public class TransactionManagementCheck extends RuntimeException {

	private String errorMessage ;
	private int errorCode;
	
}
