import java.util.*;

public class Point{
    private int x;
    private int y;

    public Point(int xx, int yy){
        x = xx;
        y = yy;
    }

    public void setX(int var){x = var;}
    public void sety(int var){y = var;}
    public int getX(){return x;}
    public int getY(){return y;}

    public int manhattanDistance (Point other){
        int xDistance = Math.abs(x - other.getX());
        int yDistance = Math.abs(y - other.getY());
        return xDistance + yDistance;
    }

    public boolean isCollinear(Point p1, Point p2){
        int p1x = p1.getX();
        int p2x = p2.getX();
        int p1y = p1.getY();
        int p2y = p2.getY();
        double slope1 = ((double)p1y - (double)y) / ((double)p1x - (double)x);
        double slope2 = ((double)p2y - (double)p1y) / ((double)p2x - (double)p1x);
        //System.out.println(slope1);
        //System.out.println(slope2);
        if (slope1 == slope2){
            return true;
        } else if (Math.abs(slope1 - slope2) <= 0.01){
            return true;
        } else if (Math.abs(slope2 - slope1 ) <= 0.01){
            return true;
        }
        return false;
    }
}