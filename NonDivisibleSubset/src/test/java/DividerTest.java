import org.junit.Test;

import java.io.File;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by aguitelson on 17.12.17.
 */
public class DividerTest {

    @Test
    public void testgetMaxSetSizeDivider() throws Exception {
        assertEquals(3, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(1, 7, 2, 4)), 3));
    }

    @Test
    public void getMaxSetSizeDivider1() throws Exception {
        assertEquals(3, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(1000000000, 1000000002, 1000000003, 1000000005)), 3));
    }

    @Test
    public void getMaxSetSizeDivider3() throws Exception {
        assertEquals(0, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(3)), 3));
    }

    @Test
    public void getMaxSetSizeDivider4() throws Exception {
        assertEquals(2, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(3, 1)), 3));
    }

    @Test
    public void getMaxSetSizeDivider5() throws Exception {
        assertEquals(0, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(0, 3)), 3));
    }

    @Test
    public void getMaxSetSizeDivider6() throws Exception {
        assertEquals(2, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(1, 2, 3)), 3));
    }

    @Test
    public void getMaxSetSizeDivider7() throws Exception {
        assertEquals(1, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(1, 2, 3)), 1));
    }

    @Test
    public void getMaxSetSizeDivider8() throws Exception {
        assertEquals(2, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(1, 2, 3, 6)), 3));
    }

    @Test
    public void getMaxSetSizeDivider9() throws Exception {
        assertEquals(1, Solution.getMaxSetSizeDivider(
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 1));
    }

    @Test
    public void getMaxSetSizeDivider10() throws Exception {
        File file = new File("/home/aguitelson/consultant-pa/TestJava8/src/test/java/input.txt");
        Scanner in = new Scanner(file);
        int set_size = in.nextInt();
        int divider = in.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < set_size; i++) {
            l.add(in.nextInt());
        }
        NonDivisibleSubset g = new NonDivisibleSubset(l, divider);
        assertEquals(49747, g.getWeight());

    }
}