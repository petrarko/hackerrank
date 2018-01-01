import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        Coordinate quinPosition = new Coordinate(rQueen, cQueen);
        List <Coordinate> obstacles = new ArrayList<>(k);
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            obstacles.add(new Coordinate(rObstacle, cObstacle));
        }
        Queen q = new Queen(n, quinPosition, obstacles);
        System.out.println(q.getNumberOfAttackedSquares());
    }
}