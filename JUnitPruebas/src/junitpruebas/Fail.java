package junitpruebas;

import static org.junit.Assert.assertNotNull;

public class Fail {

	public void methodNull(Integer x) throws IllegalArgumentException {
		if(x==null)
			throw new NullPointerException();
	    if (x < 0) {
	      throw new IllegalArgumentException();
	    }
	
	    
	
}
}
