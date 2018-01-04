import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by aguitelson on 1/1/18.
 */
public class QueenTest {
    @org.junit.Test
    public void getNumberOfAttackedSquares() throws Exception {
        Queen queen = new Queen(4, new Coordinate(4, 4), new ArrayList<Coordinate>());
        assertEquals(9, queen.getNumberOfAttackedSquares());
    }


    @org.junit.Test
    public void getNumberOfAttackedSquares1() throws Exception {

        Queen queen = new Queen(5, new Coordinate(4, 3), Coordinate.build(5, 5,
                4, 2,
                2, 3));
        assertEquals(10, queen.getNumberOfAttackedSquares());
    }


    @org.junit.Test
    public void getNumberOfAttackedSquares2() throws Exception {

        Queen queen = new Queen(1, new Coordinate(1, 1), new ArrayList<>());
        assertEquals(0, queen.getNumberOfAttackedSquares());
    }


    @org.junit.Test
    public void getNumberOfAttackedSquares3() throws Exception {

        Queen queen = new Queen(2, new Coordinate(1, 1), new ArrayList<>());
        assertEquals(3, queen.getNumberOfAttackedSquares());
    }

    @org.junit.Test
    public void getNumberOfAttackedSquares4() throws Exception {
        Queen queen = new Queen(2, new Coordinate(1, 1), Coordinate.build(2, 2));
        assertEquals(2, queen.getNumberOfAttackedSquares());
    }

    @org.junit.Test
    public void getNumberOfAttackedSquares5() throws Exception {
        Queen queen = new Queen(7, new Coordinate(6, 4), Coordinate.build(5, 6,
                6,2,
                3,1,
                1,4,
                7,7,
                4,6
                ));
        assertEquals(14, queen.getNumberOfAttackedSquares());
    }


    @org.junit.Test
    public void getNumberOfAttackedSquares6() throws Exception {
        Queen queen = new Queen(7, new Coordinate(2, 6), Coordinate.build(5, 6,
                6,2,
                3,1,
                1,4,
                7,7,
                4,6
        ));
        assertEquals(new Coordinate(1, -1), queen.getClosestObstracles().get(Vertical.NINE));
        assertEquals(new Coordinate(5, 1), queen.getClosestObstracles().get(Vertical.ELEVEN));
        assertEquals(new Coordinate(3, 5), queen.getClosestObstracles().get(Vertical.TWELVE));
        assertEquals(new Coordinate(3, 7), queen.getClosestObstracles().get(Vertical.ONE));
        assertEquals(new Coordinate(1, 7), queen.getClosestObstracles().get(Vertical.THREE));
        assertEquals(new Coordinate(-1, 7), queen.getClosestObstracles().get(Vertical.FIVE));
        assertEquals(new Coordinate(-1, 5), queen.getClosestObstracles().get(Vertical.SIX));
        assertEquals(new Coordinate(-1, 3), queen.getClosestObstracles().get(Vertical.SEVEN));
        assertEquals(14, queen.getNumberOfAttackedSquares());
    }


    @org.junit.Test
    public void getNumberOfAttackedSquares7() throws Exception {
        Queen queen = new Queen(7, new Coordinate(3, 3), Coordinate.build(5, 6,
                6,2,
                3,1,
                1,4,
                7,7,
                4,6
        ));
        assertEquals(20, queen.getNumberOfAttackedSquares());
    }


    @org.junit.Test
    public void getNumberOfAttackedSquares8() throws Exception {
        Queen queen = new Queen(7, new Coordinate(4, 2), Coordinate.build(5, 6,
                6,2,
                3,1,
                1,4,
                7,7,
                4,6
        ));
        assertEquals(new Coordinate(3, -1), queen.getClosestObstracles().get(Vertical.NINE));
        assertEquals(new Coordinate(5, -1), queen.getClosestObstracles().get(Vertical.ELEVEN));
        assertEquals(new Coordinate(5, 1), queen.getClosestObstracles().get(Vertical.TWELVE));
        assertEquals(new Coordinate(7, 5), queen.getClosestObstracles().get(Vertical.ONE));
        assertEquals(new Coordinate(3, 5), queen.getClosestObstracles().get(Vertical.THREE));
        assertEquals(new Coordinate(-1, 5), queen.getClosestObstracles().get(Vertical.FIVE));
        assertEquals(new Coordinate(-1, 1), queen.getClosestObstracles().get(Vertical.SIX));
        assertEquals(new Coordinate(2, 0), queen.getClosestObstracles().get(Vertical.SEVEN));
        assertEquals(15, queen.getNumberOfAttackedSquares());
    }




}