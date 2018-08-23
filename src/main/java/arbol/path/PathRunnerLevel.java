package arbol.path;

import arbol.path.level.utils.MapArbolUtil;
import arbol.path.level.utils.ResponseBuilderArbol;
import arbol.tda.ArbolDataAbstraction;

import java.util.Map;

public class PathRunnerLevel {

    private MapArbolUtil mapArbolUtil;

    private ResponseBuilderArbol responseBuilderArbol;

    public PathRunnerLevel(MapArbolUtil mapArbolUtil, ResponseBuilderArbol responseBuilderArbol) {
        this.mapArbolUtil = mapArbolUtil;
        this.responseBuilderArbol = responseBuilderArbol;
    }

    public String showAllNodes(ArbolDataAbstraction arbolExample) {

        Map<Integer, String> mapResul = mapArbolUtil.getMapArbol(arbolExample);

        return responseBuilderArbol.buildResponse(mapResul);

    }




}



