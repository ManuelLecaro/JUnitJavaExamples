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
     
//Es la mejor prueba para el metodo es impar porque este metodo retorna un booleano
    //y queremos ver si es cierto que retorna falso de acuerdo a lo esperado
    @Test
    public void pruebaNumeroImpar(){
        AssertFalse asft = new AssertFalse();
        assertFalse(asft.esImpar(34));
    }
}