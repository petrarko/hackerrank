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

    public Coordinate minusOne(){
        return new Coordinate(this.x-1, this.y-1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (x != that.x) return false;
        return y == that.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }


    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
