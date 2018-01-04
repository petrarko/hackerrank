import java.util.*;

/**
 * Created by aguitelson on 1/1/18.
 */
enum Vertical {
    NINE,
    ELEVEN,
    TWELVE,
    ONE,
    THREE,
    FIVE,
    SIX,
    SEVEN,
    NONE;

    public static Vertical detectType(Coordinate queen, Coordinate point) {
        if (point.getX() > queen.getX()) {
            if (point.getY() == queen.getY()) {
                return TWELVE;
            }else if(point.getY()-queen.getY()==point.getX()-queen.getX()){
                return ONE;
            }else if(point.getY()-queen.getY()==-point.getX()+queen.getX()){
                return ELEVEN;
            }
            return NONE;
        } else if (point.getX() == queen.getX()) {
            return point.getY() > point.getY() ? THREE : NINE;
        } else {
            if (point.getY() == queen.getY()) {
                return SIX;
            }else if(point.getY()-queen.getY()==point.getX()-queen.getX()){
                return SEVEN;
            }else if(point.getY()-queen.getY()==-point.getX()+queen.getX()){
                return FIVE;
            }
            return NONE;
        }
    }

    public static Coordinate chooseClosestOnVertical(Coordinate start, Coordinate p1, Coordinate p2) {
        return Math.pow(start.getX() - p1.getX(), 2) + Math.pow(start.getY() - p1.getY(), 2)
                > Math.pow(start.getX() - p2.getX(), 2) + Math.pow(start.getY() - p2.getY(), 2) ?
                p2 : p1;
    }

    public static Map<Vertical, Coordinate> createInitialVerticalMap(Coordinate queen, int descSize) {
        HashMap<Vertical, Coordinate> map = new HashMap<>();
        map.put(NINE, new Coordinate(queen.getX(), -1));
        map.put(TWELVE, new Coordinate(descSize, queen.getY()));
        map.put(THREE, new Coordinate(queen.getX(), descSize));
        map.put(SIX, new Coordinate(-1, queen.getY()));

        if(queen.getY()>descSize-1-queen.getX()){
            map.put(ELEVEN, negativeEquation(queen, false, descSize));
            map.put(FIVE, negativeEquation(queen, true, descSize));
        }else {
            map.put(ELEVEN, negativeEquation(queen, true, -1));
            map.put(FIVE, negativeEquation(queen,false, -1));
        }

        if(queen.getY()>queen.getX()){
            map.put(ONE, positiveEquation(queen, true, descSize));
            map.put(SEVEN, positiveEquation(queen, false, -1));
        }else {
            map.put(ONE, positiveEquation(queen, false, descSize));
            map.put(SEVEN, positiveEquation(queen, true, -1));
        }
        return map;
    }

    private static Coordinate negativeEquation(Coordinate queen, boolean findX, int knownCordinate){
        int secondCord =  queen.getY()-knownCordinate+queen.getX();
        return findX ? new Coordinate(secondCord, knownCordinate) : new Coordinate(knownCordinate, secondCord);

    }

    private static Coordinate positiveEquation(Coordinate queen, boolean findX, int knownCordinate){
        if(findX){
            return new Coordinate(queen.getX()+knownCordinate-queen.getY(), knownCordinate);
        }else {
            return new Coordinate(knownCordinate, -queen.getX()+knownCordinate+queen.getY());
        }
    }

    public static int distance(Coordinate c, Coordinate queenPasition, Vertical vertical) {
        int deltaX = Math.abs(queenPasition.getX()-c.getX());
        int deltaY = Math.abs(queenPasition.getY()-c.getY());
        if(deltaX ==0){
            return deltaY-1;
        }else {
            return deltaX-1;
        }
    }
}
