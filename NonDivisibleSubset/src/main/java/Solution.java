import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/non-divisible-subset/problem
 */
public class Solution {

    static int getMaxSetSizeDivider(List<Integer> elements, int divider) {
        NonDivisibleSubset g = new NonDivisibleSubset(elements, divider);
        return g.getWeight();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int set_size = in.nextInt();
        int divider = in.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < set_size; i++) {
            l.add(in.nextInt());
        }
        System.out.println(getMaxSetSizeDivider(l, divider));

    }


}