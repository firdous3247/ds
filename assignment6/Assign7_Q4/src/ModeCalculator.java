import java.util.HashMap;
import java.util.Map;

public class ModeCalculator {

    public static Integer findMode(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = array[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 3, 2, 4, 5, 5, 5, 2, 3};
        Integer mode = findMode(array);
        
        System.out.println("The mode of the array is: " + mode);
    }
}
