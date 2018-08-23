package arbol.path.level.utils;

import arbol.tda.ArbolHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class MapArbolUtilTest {

    @Test
    public void isClassThere() {
        new MapArbolUtil();
    }

    @Test
    public void isAllowToCallMethod() {
        MapArbolUtil mapArbolUtil = new MapArbolUtil();
      Map result =  mapArbolUtil.getMapArbol(ArbolHelper.getArbolExample());
    }

    @Test
    public void chedkResults() {
        MapArbolUtil mapArbolUtil = new MapArbolUtil();
        Map<Integer,String> result =  mapArbolUtil.getMapArbol(ArbolHelper.getArbolExample());
        Assert.assertEquals("A",result.get(0));
        Assert.assertEquals("BC",result.get(1));
        Assert.assertEquals("DEFG",result.get(2));
        Assert.assertEquals("H",result.get(3));
    }

    @Test
    public void chedkResultsExample2() {
        MapArbolUtil mapArbolUtil = new MapArbolUtil();
        Map<Integer,String> result =  mapArbolUtil.getMapArbol(ArbolHelper.getArbolExample2());
        Assert.assertEquals("A",result.get(0));
        Assert.assertEquals("BC",result.get(1));
        Assert.assertEquals("DEFG",result.get(2));
        Assert.assertEquals("HIJ",result.get(3));
    }
}
