package junitpruebas;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AssertNull {
	
	public AssertNull() {
	}
	
    public String getMapValue(final String key){
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value 1");
        map.put("key2", "value 2");
        map.put("key3", "value 3");
        return map.get(key);
    }
     
    @Test
    public void test(){
    	
        AssertNull ann = new AssertNull();
        assertNotNull(ann.getMapValue("key3"));

    }
}
