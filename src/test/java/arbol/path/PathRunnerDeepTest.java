package arbol.path;

import arbol.path.PathRunnerDeep;
import arbol.tda.ArbolHelper;
import org.junit.Assert;
import org.junit.Test;

public class PathRunnerDeepTest {

    @Test
    public void isClassThere() {
        new PathRunnerDeep();
    }

    @Test
    public void ableToCallMethod() {
        PathRunnerDeep pathRunnerDeep = new PathRunnerDeep();
        pathRunnerDeep.showAllNodes(ArbolHelper.getArbolExample());
    }



    @Test
    public void checkValueContainsABDHECFG() {
        PathRunnerDeep pathRunnerDeep = new PathRunnerDeep();
        String nodes = pathRunnerDeep.showAllNodes(ArbolHelper.getArbolExample());
        Assert.assertEquals("ABDHECFG",nodes);
    }
}
