package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop.exception.InsufficientFundsExp;

@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.hexaware.aop.service.*.*())")
	public void beforeLogs() {
		System.out.println("Logging before any Bank Service");
	}
	
	@After("execution(* com.hexaware.aop.service.BankService.fundTransfer())")
	public void afterLogs() {
		System.out.println("Logging after any fund transfer service");
	}
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.checkBalance(..))")
	public void afterReturningPointCut() {
		
	}
	
	@AfterReturning(pointcut = "afterReturningPointCut()", returning = "balance")
	public void afterReturningBalance(int balance) {
		System.out.println("Logging after only returning balance" + balance);
	}
	
	@AfterThrowing(pointcut = "afterReturningPointCut()", throwing = "e")
	public void afterThrowingExp(InsufficientFundsExp e) {
		System.out.println("Logging after Exception: " + e);
	}
}
