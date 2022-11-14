import jdk.jshell.spi.ExecutionControlProvider;

import java.awt.geom.Point2D;

public class Polygon {
    private Point[] points;
    /*Point pO1 = new Point (0,0);
    Point pO2 = new Point (2,0);
    Point pO3 = new Point (2,2);
    Point pO4 = new Point (0,2);
    private Point Point1=pO1;
    private Point Point2=pO2;
    private Point Point3=pO3;
    private Point Point4=pO4;*/

    //Point [] myPoints = new Point [3];
    //myPoints[0]=Point1;
    //myPoints[1]=Point2;
    //myPoints[2]=Point3;
    //myPoints[3]=Point4;

    //Non parameter constructor and makes polygon of 4 sides
    public Polygon() {
        Point[] arrP = new Point[10];
        arrP[0] = new Point(0, 0);
        arrP[1] = new Point(0, 1);
        arrP[2] = new Point(1, 1);
        arrP[3] = new Point(1, 0);
    }

    public Polygon(Point[] ps) throws Exception {
        if (ps.length > 10) {
            throw new Exception("We can't initialize polygons with more than 10 points.");
        }
        int i;
        this.points = new Point[10];
        for (i = 0; i < ps.length && i < 10; i++) {
            this.points[i] = ps[i];
        }
    }
    public String toString(Point[] ps) {
        int i = 0;
        String StrPo = new String();
        for (i = 0; (i < ps.length) && (i < 10) && (ps[i]!=null); i++) {
            StrPo = StrPo + "(" + ps[i].getX() + "," + ps[i].getY() + ")" + " - ";
        }
        return StrPo + "(" + ps[0].getX() + "," + ps[0].getY() + ")";
    }
    public Polygon setOffset(int offX, int offY, Point[] ps) {
        int i = 0;
        for (i = 0; (i < ps.length) && (i < 10) && (ps[i]!=null); i++) {
            ps[i].setOffset(offX,offY);
        }
        //Must include new
        return new Polygon();
    }

    public double getLength(Point[] ps){
        double totalLength=0;
        int i = 0;
        for (i = 1; (i < ps.length) && (i < 10) && (ps[i]!=null); i++) {
            Segment aux = new Segment(ps[i],ps[i-1]);
            totalLength+=aux.module(aux);
        }
        Segment aux = new Segment(ps[0],ps[1]);
        totalLength+=aux.module(aux);

    return totalLength;
    }
}









        //startPoint.setX(0);
        //startPoint.setY(0);
        //endPoint.setX(0);
        //endPoint.setY(0);


    //4 points argument constuctor
   /* public Polygon(Point Point1, Point Point2,Point Point3, Point Point4){
        this.Point1=Point1;
        this.Point2=Point2;
        this.Point3=Point3;
        this.Point4=Point4;

    }*/

    /*public String toString(){
        return "("+Point1.getX()+","+Point1.getY()+")"+" - "+
                "("+Point2.getX()+","+Point2.getY()+")"+" - "+
                "("+Point3.getX()+","+Point3.getY()+")"+" - "+
                "("+Point4.getX()+","+Point4.getY()+")"+" - "+
                "("+Point1.getX()+","+Point1.getY()+")";
    }*/



    /*public Polygon setOffset(int offX, int offY){
        Point1.setOffset(offX,offY);
        Point2.setOffset(offX,offY);
        Point3.setOffset(offX,offY);
        Point4.setOffset(offX,offY);
        //Must include new
        return new Polygon(Point1,Point2,Point3,Point4);
    }
}*/
