package com.ede;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@LocalBean
public class HelloBean {

	@TraceCall
  public String getSentence() {
	  return "Hi MASTER EJB";
  }

}
