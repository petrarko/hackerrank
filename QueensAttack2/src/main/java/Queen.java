import java.util.List;

/**
 * Created by aguitelson on 1/1/18.
 */
public class Queen {
    private final int descSize;
    private  final Coordinate queenPartition;
    private  final List<Coordinate> obstacles;

    public Queen(int descSize, Coordinate queenPosition, List<Coordinate> obstacles) {
        this.descSize = descSize;
        this.queenPartition = queenPosition;
        this.obstacles = obstacles;
    }

    public int getNumberOfAttackedSquares(){
        return 1;
    }
}
