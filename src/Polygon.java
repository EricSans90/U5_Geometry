import java.awt.geom.Point2D;

public class Polygon {
    Point pO1 = new Point (0,0);
    Point pO2 = new Point (2,0);
    Point pO3 = new Point (2,2);
    Point pO4 = new Point (0,2);
    private Point Point1=pO1;
    private Point Point2=pO2;
    private Point Point3=pO3;
    private Point Point4=pO4;

    //Point [] myPoints = new Point [3];
    //myPoints[0]=Point1;
    //myPoints[1]=Point2;
    //myPoints[2]=Point3;
    //myPoints[3]=Point4;



    //Non argument constructor
    public Polygon(){
        //startPoint.setX(0);
        //startPoint.setY(0);
        //endPoint.setX(0);
        //endPoint.setY(0);
    }

    //two points argument constuctor
    public Polygon(Point Point1, Point Point2,Point Point3, Point Point4){
        this.Point1=Point1;
        this.Point2=Point2;
        this.Point3=Point3;
        this.Point4=Point4;

    }
}
