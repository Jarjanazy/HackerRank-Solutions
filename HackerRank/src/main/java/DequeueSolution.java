import java.util.*;

public class DequeueSolution {

    public static int printTheLongestUniqueCombination(List<Integer> numbers, int m){
        int currentIndex = 0;
        int listLength = numbers.size();

        List<List<Integer>> numbersSubArrays = new ArrayList<>();
        while (currentIndex + m < listLength - 2){
            numbersSubArrays.add(numbers.subList(currentIndex, currentIndex+m));
            currentIndex++;
        }

        OptionalInt maxSubArraySize = numbersSubArrays.
                stream().
                map(l -> new HashSet<>(l).size()).
                mapToInt(Integer::intValue).
                max();

        return maxSubArraySize.getAsInt();
    }

}
