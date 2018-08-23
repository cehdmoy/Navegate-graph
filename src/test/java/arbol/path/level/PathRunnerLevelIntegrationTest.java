package arbol.path.level;

import arbol.path.PathRunnerLevel;
import arbol.path.level.utils.MapArbolUtil;
import arbol.path.level.utils.ResponseBuilderArbol;
import arbol.tda.ArbolHelper;
import org.junit.Test;

public class PathRunnerLevelIntegrationTest {

    private MapArbolUtil mapArbolUtil = new MapArbolUtil();

    private ResponseBuilderArbol responseBuilderArbol = new ResponseBuilderArbol();

    @Test
    public void isAbleToCallMethod() {
        PathRunnerLevel pathRunnerLevel = new PathRunnerLevel(mapArbolUtil, responseBuilderArbol);
        pathRunnerLevel.showAllNodes(ArbolHelper.getArbolExample());
    }

    @Test
    public void checkArbolValuesABCDEFGH() {
        PathRunnerLevel pathRunnerLevel = new PathRunnerLevel(mapArbolUtil, responseBuilderArbol);
        String nodes = pathRunnerLevel.showAllNodes(ArbolHelper.getArbolExample());
        org.junit.Assert.assertEquals("ABCDEFGH", nodes);
    }

    @Test
    public void checkArbolValuesABCDEFGHIJ() {
        PathRunnerLevel pathRunnerLevel = new PathRunnerLevel(mapArbolUtil, responseBuilderArbol);
        String nodes = pathRunnerLevel.showAllNodes(ArbolHelper.getArbolExample2());
        org.junit.Assert.assertEquals("ABCDEFGHIJ", nodes);
    }
}
