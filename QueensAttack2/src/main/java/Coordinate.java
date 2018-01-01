import java.util.ArrayList;
import java.util.List;

/**
 * Created by aguitelson on 1/1/18.
 */
public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static List <Coordinate> build(int ... coordinates){
        ArrayList<Coordinate> list = new ArrayList<Coordinate>();
        for(int i=0; i< coordinates.length; i+=2){
            list.add(new Coordinate(coordinates[i], coordinates[i+1]));
        }
        return list;
    }
}
