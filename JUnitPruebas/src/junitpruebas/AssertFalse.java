package junitpruebas;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AssertFalse {
	 
	public AssertFalse() {
		
	}
    public boolean esImpar(int numero){
         
        boolean resultado = true;
        if(numero%2 == 0){
            resultado = false;
        }
        return resultado;
    }
     
    @Test
    public void evenNumberTest(){
        AssertFalse asft = new AssertFalse();
        assertFalse(asft.esImpar(34));
    }
}