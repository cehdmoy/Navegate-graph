package arbol.path.level.utils;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ResponseBuilderArbolTest {
    @Test
    public void isClassThere() {
        new ResponseBuilderArbol();
    }

    @Test
    public void isAbleToCallMethod() {
        Map<Integer, String> m = new HashMap<>();
        ResponseBuilderArbol responseBuilderArbol = new ResponseBuilderArbol();
        responseBuilderArbol.buildResponse(m);
    }

    @Test
    public void chedkResponse() {
        Map<Integer,String> m = new HashMap<>();
        m.put(0,"A");
        m.put(1,"BC");
        m.put(2,"DEFG");
        m.put(3,"H");
        ResponseBuilderArbol responseBuilderArbol = new ResponseBuilderArbol();
        Assert.assertEquals("ABCDEFGH", responseBuilderArbol.buildResponse(m));
    }

}
