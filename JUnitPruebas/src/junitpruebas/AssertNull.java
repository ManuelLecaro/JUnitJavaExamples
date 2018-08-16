package junitpruebas;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AssertNull {
	
	public AssertNull() {
	}
	
	//mapa con valores fijos
	
    public String getMapValue(final String key){
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value 1");
        map.put("key2", "value 2");
        map.put("key3", "value 3");
        return map.get(key);
    }
     //este test prueba si la funcion retorna un objeto con la clave
    //si se pone "key9", el test fallara, solo con key1, key2 o key3 funcionara
    @Test
    public void test(){
    	
        AssertNull ann = new AssertNull();
        assertNotNull(ann.getMapValue("key3"));

    }
}
