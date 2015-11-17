package com.ede;

public class HelloCdi {
	
	@TraceCall
	public String getSentence() {
		return "Hi CDI Bean";
	}

}
