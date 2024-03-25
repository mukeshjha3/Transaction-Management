package com.transactionalManagement.exceptions;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class CustomUsernameNotFoundException extends RuntimeException {

	private String errorMessage ;
	private int errorCode;
	
}
