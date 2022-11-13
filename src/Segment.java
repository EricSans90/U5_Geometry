import java.lang.Math;

public class Segment {
    //2 Point fields set on private
    private Point startPoint;
    private Point endPoint;

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
}
