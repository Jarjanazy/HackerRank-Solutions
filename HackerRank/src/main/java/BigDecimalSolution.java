import java.math.BigDecimal;
import java.util.*;

public class BigDecimalSolution {
    public static void printBigDecimalInASortedWay(String[] s){
        TreeMap<BigDecimal, List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        Arrays.stream(s).filter(Objects::nonNull).forEach(number -> addToTreeMap(number, treeMap));

        int i = 0;
        for (List<String> values : treeMap.values()){
            for(String value:values){
                s[i++] = value;
            }
        }
    }

    public static void addToTreeMap(String number, TreeMap<BigDecimal, List<String>> treeMap){
        BigDecimal bigDecimal = new BigDecimal(number);

        if (treeMap.containsKey(bigDecimal)){
            List<String> numbers = treeMap.get(bigDecimal);
            numbers.add(number);
            treeMap.put(bigDecimal, numbers);
        }
        else treeMap.computeIfAbsent(bigDecimal, (k) ->  new ArrayList<>(Collections.singletonList(number)));
    }

}
