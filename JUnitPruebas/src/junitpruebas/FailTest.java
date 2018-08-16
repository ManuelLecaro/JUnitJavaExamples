package junitpruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FailTest {

	Fail fallo;
	 
	  @Before
	  public void setUp() {
	    fallo = new Fail();
	  }
	
	//Este metodo es el mas adecuado porque de este modo nos aseguramos que el metodo 
	//methodNull en Fail envia un mensaje en relacion a la excepciones que debe retornar 
	@Test
	public void test() {
	      if(fallo == null){
	        fail("fallo is null");
	      }
	   
	      try {
	        fallo.methodNull(-1);
	        fail("Should of thrown an IllegalArgumentException");
	      } catch (IllegalArgumentException e) {
	        // handle exception
	      }
	   
	    }
}


