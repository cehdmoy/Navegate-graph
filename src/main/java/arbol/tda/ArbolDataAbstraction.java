package arbol.tda;

public class ArbolDataAbstraction {

    private String name;

    private ArbolDataAbstraction rightChild;

    private ArbolDataAbstraction leftChild;


    public ArbolDataAbstraction(String name,  ArbolDataAbstraction leftChild,ArbolDataAbstraction rightChild) {
        this.name = name;
        this.rightChild = rightChild;
        this.leftChild = leftChild;
    }

    public ArbolDataAbstraction getRightChild() {
        return rightChild;
    }

    public ArbolDataAbstraction getLeftChild() {
        return leftChild;
    }


    public String getName() {
        return name;
    }





}
