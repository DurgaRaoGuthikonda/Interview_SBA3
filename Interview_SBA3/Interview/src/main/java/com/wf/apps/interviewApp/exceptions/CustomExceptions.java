package com.wf.apps.interviewApp.exceptions;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomExceptions extends RuntimeException{
	
	private LocalDateTime errorTimeStamp;
	private String errorCode;
	private String errorMessage;
	
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
	

}
