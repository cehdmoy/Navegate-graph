package arbol.path.level;

import arbol.path.PathRunnerLevel;
import arbol.path.level.utils.MapArbolUtil;
import arbol.path.level.utils.ResponseBuilderArbol;
import arbol.tda.ArbolDataAbstraction;
import arbol.tda.ArbolHelper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PathRunnerLevelTest {

    private MapArbolUtil mapArbolUtil = mock(MapArbolUtil.class);

    private ResponseBuilderArbol responseBuilderArbol=mock(ResponseBuilderArbol.class);


    @Test
    public void isClassThere() {
        new PathRunnerLevel(mapArbolUtil,responseBuilderArbol);
    }

    @Test
    public void isAbleToCallMethod() {

        PathRunnerLevel pathRunnerLevel = new PathRunnerLevel(mapArbolUtil,responseBuilderArbol);
        pathRunnerLevel.showAllNodes(ArbolHelper.getArbolExample());
    }

    @Test
    public void checkArbolValuesABCDEFGH() {

        Map<Integer,String> map = new HashMap<>();
        map.put(0,"A");
        map.put(1,"BC");
        map.put(2,"DEFG");
        map.put(3,"H");

        ArbolDataAbstraction arbolExample = ArbolHelper.getArbolExample();
        when(mapArbolUtil.getMapArbol(arbolExample)).thenReturn(map);
        when(responseBuilderArbol.buildResponse(map)).thenReturn("ABCDEFGH");

        PathRunnerLevel pathRunnerLevel = new PathRunnerLevel(mapArbolUtil,responseBuilderArbol);
        String nodes = pathRunnerLevel.showAllNodes(arbolExample);
        org.junit.Assert.assertEquals("ABCDEFGH", nodes);
    }

    @Test
    public void checkArbolValuesABCDEFGHIJ() {

        Map<Integer,String> map = new HashMap<>();
        map.put(0,"A");
        map.put(1,"BC");
        map.put(2,"DEFG");
        map.put(3,"HIJ");

        ArbolDataAbstraction arbolExample2 = ArbolHelper.getArbolExample2();
        when(mapArbolUtil.getMapArbol(arbolExample2)).thenReturn(map);
        when(responseBuilderArbol.buildResponse(map)).thenReturn("ABCDEFGHIJ");

        PathRunnerLevel pathRunnerLevel = new PathRunnerLevel(mapArbolUtil,responseBuilderArbol);
        String nodes = pathRunnerLevel.showAllNodes(arbolExample2);
        org.junit.Assert.assertEquals("ABCDEFGHIJ", nodes);
    }

}
