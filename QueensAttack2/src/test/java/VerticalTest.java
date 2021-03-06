import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by aguitelson on 1/1/18.
 */
public class VerticalTest {
    @Test
    public void distance() throws Exception {
        assertEquals(1, Vertical.distance(new Coordinate(3, 2), new Coordinate(5, 4), Vertical.ELEVEN));
    }


    @Test
    public void createInitialVerticalMap() throws Exception {
        Map<Vertical, Coordinate> initialVerticalMap = Vertical.createInitialVerticalMap(new Coordinate(3, 4), 7);
        assertEquals(new Coordinate(-1, 4), initialVerticalMap.get(Vertical.SIX));
        assertEquals(new Coordinate(7, 4), initialVerticalMap.get(Vertical.TWELVE));
        assertEquals(new Coordinate(3, 7), initialVerticalMap.get(Vertical.THREE));
        assertEquals(new Coordinate(3, -1), initialVerticalMap.get(Vertical.NINE));

        assertEquals(new Coordinate(7, 0), initialVerticalMap.get(Vertical.ELEVEN));
        assertEquals(new Coordinate(6, 7), initialVerticalMap.get(Vertical.ONE));
        assertEquals(new Coordinate(0, 7), initialVerticalMap.get(Vertical.FIVE));
        assertEquals(new Coordinate(-1, 0), initialVerticalMap.get(Vertical.SEVEN));
    }


    @Test
    public void createInitialVerticalMap1() throws Exception {
        Map<Vertical, Coordinate> initialVerticalMap = Vertical.createInitialVerticalMap(new Coordinate(5, 3), 7);
        assertEquals(Vertical.SEVEN, Vertical.detectType(new Coordinate(5, 3), new Coordinate(2,0)));
        assertEquals(new Coordinate(1, -1), initialVerticalMap.get(Vertical.SEVEN));
    }

    @Test
    public void createInitialVerticalMap2() throws Exception {
        Map<Vertical, Coordinate> initialVerticalMap = Vertical.createInitialVerticalMap(new Coordinate(1, 5), 7);
        assertEquals(Vertical.ELEVEN, Vertical.detectType(new Coordinate(1, 5), new Coordinate(5,1)));
    }

    @Test
    public void createInitialVerticalMap3() throws Exception {
        assertEquals(Vertical.NINE, Vertical.detectType(new Coordinate(1, 5), new Coordinate(1,4)));
    }


    @Test
    public void createInitialVerticalMap4() throws Exception {
        assertEquals(Vertical.THREE, Vertical.detectType(new Coordinate(3, 1), new Coordinate(3,5)));
    }



}