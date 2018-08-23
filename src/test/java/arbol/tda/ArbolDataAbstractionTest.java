package arbol.tda;


import org.junit.Assert;
import org.junit.Test;

public class ArbolDataAbstractionTest {

    @Test
    public void isClassThere() {

        ArbolDataAbstraction arbolDataAbstraction = new ArbolDataAbstractionBuilder().setName("A").createArbolDataAbstraction();
        Assert.assertNotNull(arbolDataAbstraction);
    }

    @Test
    public void checkNodeName() {
        ArbolDataAbstraction arbolDataAbstraction = new ArbolDataAbstractionBuilder().setName("A").createArbolDataAbstraction();
        String name = arbolDataAbstraction.getName();
        Assert.assertEquals("A",name);
    }

    @Test
    public void checkNodeNameLeftChild() {
        ArbolDataAbstraction arbolDataAbstractionB = new ArbolDataAbstractionBuilder().setName("B").createArbolDataAbstraction();



        ArbolDataAbstraction arbolDataAbstraction = new ArbolDataAbstractionBuilder().setName("A").setLeftChild(arbolDataAbstractionB).createArbolDataAbstraction();
         ArbolDataAbstraction arbolDataAbstractionLeftChild = arbolDataAbstraction.getLeftChild();
       Assert.assertEquals("B", arbolDataAbstractionLeftChild.getName());
    }

    @Test
    public void checkNodeNameLRightChild() {

        ArbolDataAbstraction arbolDataAbstractionC = new ArbolDataAbstractionBuilder().setName("C").setLeftChild(null).createArbolDataAbstraction();
        ArbolDataAbstraction arbolDataAbstraction = new ArbolDataAbstractionBuilder().setName("A").setRightChild(arbolDataAbstractionC).createArbolDataAbstraction();
        ArbolDataAbstraction arbolDataAbstractionLeftChild = arbolDataAbstraction.getRightChild();
        Assert.assertEquals("C", arbolDataAbstractionLeftChild.getName());
    }
}
