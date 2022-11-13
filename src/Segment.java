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
}
