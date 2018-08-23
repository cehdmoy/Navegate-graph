package arbol.path;

import arbol.tda.ArbolDataAbstraction;

public class PathRunnerDeep {

    private String result = "";

    public String showAllNodes(ArbolDataAbstraction arbolExample) {
        processArrbol(arbolExample);
        return result;


    }

    private void processArrbol(ArbolDataAbstraction arbolExample){
        result += arbolExample.getName();
        if(arbolExample.getLeftChild()!=null)
        {
            processArrbol(arbolExample.getLeftChild());
        }
        if(arbolExample.getRightChild()!=null)
        {
            processArrbol(arbolExample.getRightChild());
        }

    }
}
