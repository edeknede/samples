package com.ede;

import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


@TraceCall
@Interceptor
public class TraceCallInterceptor implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@AroundInvoke 
	public Object traceMethodCall(InvocationContext invocationContext) throws Exception {
		System.out.println("Entering method: " +invocationContext.getTarget().getClass() + "." +invocationContext.getMethod().getName());
		return invocationContext.proceed();
		
	}

}
