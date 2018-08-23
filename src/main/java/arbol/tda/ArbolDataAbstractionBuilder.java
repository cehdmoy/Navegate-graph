package arbol.tda;

public class ArbolDataAbstractionBuilder {
    private String name;
    private ArbolDataAbstraction leftChild;
    private ArbolDataAbstraction rightChild;

    public ArbolDataAbstractionBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ArbolDataAbstractionBuilder setLeftChild(ArbolDataAbstraction leftChild) {
        this.leftChild = leftChild;
        return this;
    }

    public ArbolDataAbstractionBuilder setRightChild(ArbolDataAbstraction rightChild) {
        this.rightChild = rightChild;
        return this;
    }

    public ArbolDataAbstraction createArbolDataAbstraction() {
        return new ArbolDataAbstraction(name, leftChild, rightChild);
    }
}