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

        Queen queen = new Queen(4, new Coordinate(4, 4), Coordinate.build(5, 3,
                4, 3,
                5, 5,
                4, 2,
                2, 3));
        assertEquals(19, queen.getNumberOfAttackedSquares());
    }

}