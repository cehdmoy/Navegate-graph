package arbol.path.level.utils;

import arbol.tda.ArbolDataAbstraction;

import java.util.HashMap;
import java.util.Map;

public class MapArbolUtil {
    public Map<Integer, String> getMapArbol(ArbolDataAbstraction arbol) {
        return processArbolAsMapLevel(arbol);
    }

    private Map<Integer, String> processArbolAsMapLevel(ArbolDataAbstraction arbolExample) {
        Map<Integer, String> mapResul = new HashMap<>();
        mapResul.put(0, arbolExample.getName());
        processAbol(1, arbolExample.getLeftChild(), arbolExample.getRightChild(), mapResul);
        return mapResul;
    }

    private void processAbol(int levelCount, ArbolDataAbstraction left, ArbolDataAbstraction righ, Map<Integer, String> mapResul) {


        if (left != null && righ != null) {

            if (mapResul.get(levelCount) == null) {
                mapResul.put(levelCount, left.getName() + righ.getName());
            } else {
                String temp = mapResul.get(levelCount);
                temp += left.getName() + righ.getName();
                mapResul.put(levelCount, temp);

            }
            ++levelCount;
            processAbol(levelCount, left.getLeftChild(), left.getRightChild(), mapResul);
            processAbol(levelCount, righ.getLeftChild(), righ.getRightChild(), mapResul);
        } else if (left != null) {


            if (mapResul.get(levelCount) == null) {
                mapResul.put(levelCount, left.getName());

            }


            ++levelCount;
            processAbol(levelCount, left.getLeftChild(), left.getRightChild(), mapResul);
        }
    }
}
