public class Line2D{
    private Point p1;
    private Point p2;

    public Line2D (Point p1, Point p2){
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
    }

    public Line2D(int x1, int y1, int x2, int y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Point getP1(){return p1;}
    public Point getP2(){return p2;}

    public String toString(){return "[(" + p1.getX() + ", " + p1.getY() + "), " + "(" + p2.getX() + ", " + p2.getY() + ")]";}

    public double getSlope(){
        int p1x = p1.getX();
        int p2x = p2.getX();
        int p1y = p1.getY();
        int p2y = p2.getY();
        double slope = ((double)p2y - (double)p1y) / ((double)p2x - (double)p1x);
        return slope;
    }

    public boolean isCollinear(Point p){
        return p.isCollinear(p1, p2);
    }
}