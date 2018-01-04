import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aguitelson on 1/1/18.
 */
public class Queen {


    private final Coordinate queenPasition;
    private final List<Coordinate> obstacles = new ArrayList<>();


    private final Map<Vertical, Coordinate> closestObstracles;

    public Queen(int descSize, Coordinate queenPosition, List<Coordinate> obstacles) {
        this.queenPasition = queenPosition.minusOne();
        for(Coordinate o: obstacles){
            this.obstacles.add(o.minusOne());
        }
        closestObstracles = Vertical.createInitialVerticalMap(this.queenPasition, descSize);
        for(Coordinate o : this.obstacles){
            Vertical vertical = Vertical.detectType(queenPasition, o);
            if(vertical != Vertical.NONE){
                Coordinate closest = Vertical.chooseClosestOnVertical(queenPasition, closestObstracles.get(vertical), o);
                closestObstracles.put(vertical, closest);
            }
        }
    }

    public int getNumberOfAttackedSquares() {
        int sum = 0;
        for (Map.Entry<Vertical, Coordinate> e : closestObstracles.entrySet()){
            sum+=Vertical.distance(e.getValue(), queenPasition, e.getKey());
        }
        return sum;
    }

    public Map<Vertical, Coordinate> getClosestObstracles() {
        return closestObstracles;
    }


}
