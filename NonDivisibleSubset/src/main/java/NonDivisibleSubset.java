import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aguitelson on 24.12.17.
 */
public class NonDivisibleSubset {
    private final Map<Integer, Integer> remainderToCount;
    private final Map<Integer, Integer> pairs;
    private final List<Integer> unpaired;
    private final int divider;


    public NonDivisibleSubset(List<Integer> elements, int divider) {
        this.remainderToCount = new HashMap<>();
        this.divider = divider;
        for (int l : elements) {
            int rem = l % divider;
            if (remainderToCount.containsKey(rem)) {
                remainderToCount.put(rem, remainderToCount.get(rem) + 1);
            } else {
                remainderToCount.put(rem, 1);
            }
        }
        if (this.divider%2==0 && remainderToCount.containsKey(this.divider/2) ) {
            remainderToCount.put(this.divider/2, 1);
        }
        this.pairs = new HashMap<>();
        this.unpaired = new ArrayList<>();
        for (int i : remainderToCount.keySet()) {
            if (i == 0) {
                unpaired.add(i);
                continue;
            }

            if ( i == 0) {
                unpaired.add(i);
                continue;
            }
            if (!pairs.containsKey(i) && !pairs.containsValue(i)) {
                if (remainderToCount.containsKey(this.divider - i)) {
                    pairs.put(i, this.divider - i);
                } else {
                    unpaired.add(i);
                }
            }
        }
    }


    public int getWeight() {
        int sum = 0;
        for (int i : unpaired) {
            if (i != 0) {
                sum += remainderToCount.get(i);
            }
        }
        for (Map.Entry<Integer, Integer> e : pairs.entrySet()) {
            sum += Math.max(remainderToCount.get(e.getKey()), remainderToCount.get(e.getValue()));
        }

        // zero element can be added only once
        if (sum != 0 && unpaired.contains(0)) {
            sum++;
        }
        if (divider == 1){
            return 1;
        }
        return sum;
    }


}