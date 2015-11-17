package com.ede;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.annotation.ElementType.METHOD;
import javax.interceptor.InterceptorBinding;

@InterceptorBinding
@Target({ TYPE, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TraceCall {

}
