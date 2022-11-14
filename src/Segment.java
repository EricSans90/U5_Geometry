import java.lang.Math;

public class Segment {
    //2 Point fields set on private
    Point p1 = new Point (0,0);
    Point p2 = new Point (0,0);
    private Point startPoint=p1;
    private Point endPoint=p2;

    //Non argument constructor
    public Segment(){
        startPoint.setX(0);
        startPoint.setY(0);
        endPoint.setX(0);
        endPoint.setY(0);
    }

    //two points argument constuctor
    public Segment(Point p1, Point p2){
        startPoint=p1;
        endPoint=p2;
    }

    public Point getStartPoint(){
        return startPoint;
    }
    public Point getEndPoint(){
        return endPoint;
    }

    //method module
    public double module(Segment s1){
        double x1=0, x2=0, y1=0, y2=0, xDistance=0, yDistance=0;
        x1=s1.getStartPoint().getX();
        y1=s1.getStartPoint().getY();
        x2=s1.getEndPoint().getX();
        y2=s1.getEndPoint().getY();
        xDistance = x2-x1;
        yDistance = y2-y1;

        return Math.sqrt(Math.pow(xDistance,2)+Math.pow(yDistance,2));
    }

    public String toString(){
        return "("+getStartPoint().getX()+","+getStartPoint().getY()+")"+" - "+
                "("+getEndPoint().getX()+","+getEndPoint().getY()+")";
    }

    public Segment setOffset(int offX, int offY){
        startPoint.setOffset(offX,offY);
        endPoint.setOffset(offX,offY);
        //Must include new
        return new Segment(startPoint,endPoint);
    }

    public Point setStartPoint(Point startP){
        return this.startPoint=startP;
    }
    public Point setEndPoint(Point endP){
        return this.endPoint=endP;
    }
}
