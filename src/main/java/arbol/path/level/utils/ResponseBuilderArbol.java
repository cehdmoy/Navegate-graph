package arbol.path.level.utils;

import java.util.Map;

public class ResponseBuilderArbol {
    public String buildResponse(Map<Integer, String> mapResul) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < mapResul.size(); i++) {
            result.append(mapResul.get(i));
        }

        return result.toString();
    }
}
