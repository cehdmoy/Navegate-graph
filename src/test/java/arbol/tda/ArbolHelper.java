package arbol.tda;

public class ArbolHelper {


    private ArbolHelper() {
    }


    public static ArbolDataAbstraction getArbolExample() {
        ArbolDataAbstraction arbolDataAbstractionH = new ArbolDataAbstractionBuilder().setName("H").createArbolDataAbstraction();
        ArbolDataAbstraction arbolDataAbstractionD = new ArbolDataAbstractionBuilder().setName("D").setLeftChild(arbolDataAbstractionH)
                .createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionE = new ArbolDataAbstractionBuilder().setName("E").createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionF = new ArbolDataAbstractionBuilder().setName("F").createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionG = new ArbolDataAbstractionBuilder().setName("G").createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionB = new ArbolDataAbstractionBuilder().setName("B")
                .setLeftChild(arbolDataAbstractionD).setRightChild(arbolDataAbstractionE).createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionC = new ArbolDataAbstractionBuilder().setName("C")
                .setLeftChild(arbolDataAbstractionF).setRightChild(arbolDataAbstractionG).createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionA = new ArbolDataAbstractionBuilder().setName("A")
                .setLeftChild(arbolDataAbstractionB).setRightChild(arbolDataAbstractionC).createArbolDataAbstraction();

        return arbolDataAbstractionA;


    }

    public static ArbolDataAbstraction getArbolExample2() {

        ArbolDataAbstraction arbolDataAbstractionI = new ArbolDataAbstractionBuilder().setName("I").createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionJ = new ArbolDataAbstractionBuilder().setName("J").createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionH = new ArbolDataAbstractionBuilder().setName("H").createArbolDataAbstraction();
        ArbolDataAbstraction arbolDataAbstractionD = new ArbolDataAbstractionBuilder().setName("D").setLeftChild(arbolDataAbstractionH)
                .createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionE = new ArbolDataAbstractionBuilder().setName("E").createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionF = new ArbolDataAbstractionBuilder().setName("F").createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionG = new ArbolDataAbstractionBuilder().setName("G").setLeftChild(arbolDataAbstractionI)
                .setRightChild(arbolDataAbstractionJ).createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionB = new ArbolDataAbstractionBuilder().setName("B")
                .setLeftChild(arbolDataAbstractionD).setRightChild(arbolDataAbstractionE).createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionC = new ArbolDataAbstractionBuilder().setName("C")
                .setLeftChild(arbolDataAbstractionF).setRightChild(arbolDataAbstractionG).createArbolDataAbstraction();

        ArbolDataAbstraction arbolDataAbstractionA = new ArbolDataAbstractionBuilder().setName("A")
                .setLeftChild(arbolDataAbstractionB).setRightChild(arbolDataAbstractionC).createArbolDataAbstraction();

        return arbolDataAbstractionA;
    }


}
