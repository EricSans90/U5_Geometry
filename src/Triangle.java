import java.lang.Math;
public class Triangle {
    private Point v1, v2 ,v3;

    public Triangle (int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1=new Point(x1,y1);
        this.v2=new Point(x2,y2);
        this.v3=new Point(x3,y3);
    }

    public Triangle (Point p1, Point p2, Point p3){
        v1=p1;
        v2=p2;
        v3=p3;
    }

/*    public double getPerimeter(){
        Segment s1 = new Segment(this.v1,this.v2);
        Segment s2 = new Segment(this.v2,this.v3);
        Segment s3 = new Segment(this.v1,this.v3);
        //I had a poorly made constructor for module, but I reused it here:
        return s1.module(s1)+s2.module(s2)+s3.module(s3);
    }*/
    public double getPerimeter(){
        Segment s1 = new Segment(this.v1,this.v2);
        Segment s2 = new Segment(this.v2,this.v3);
        Segment s3 = new Segment(this.v1,this.v3);
        //I had a poorly made constructor for module, but I reused it here:
        return s1.module()+s2.module()+s3.module();
    }

    public String printType(){
        Segment s1 = new Segment(this.v1,this.v2);
        Segment s2 = new Segment(this.v2,this.v3);
        Segment s3 = new Segment(this.v1,this.v3);
        if (s1.module() == s2.module() && s2.module() == s3.module()) {
            return "equilateral";
        } else if (s1.module() == s2.module() || s1.module() == s3.module()||s2.module() == s3.module()) {
            return "isosceles";
        } else
        return "scalene";


    }

    public Point getV1() {
        return v1;
    }

    public Point getV2() {
        return v2;
    }

    public Point getV3() {
        return v3;
    }

    @Override
    public String toString() {
        return "Triangle @ " + v1 +", " + v2 +", " + v3;
    }
}
