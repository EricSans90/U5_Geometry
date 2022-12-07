public class Point {
    //2 int fields set on private
    private int x = 0;
    private int y = 0;

    //a no parameter constructor
    public Point (){
        x=0;
        y=0;
    }

    //using this
    //public Point (){
    //  this(0,0)
    //}

    //a 2 type int parameter constructor
    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }

    //using this
    //public Point(int x, int y) {
    //  (this.x) se refiere al field = (x); se refiere al parametro
    //  this.y=y;
    //}

    //public method to set non-negative X
    //public void setX(int newX){
    //    if newX (<0){
    //        x=-newX;
    //    } else {
    //        x=newX;
    //    }
    //}

    public void setX(int newX){
        x=newX;
    }
    //using this
    //public void setX(int x){
    //    this.x=x;
    //}
    public void setY(int newY){
        y=newY;
    }
    //using this
    //public void setY(int y){
    //    this.y=y;
    //}

    public String toString(){
        return "("+x+","+y+")";
    }

    public void moveTo(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setOffset(int offX, int offY){
        x+=offX;
        y+=offY;
    }
    /* Create a
static method in the class Point distance() that accepts two points as a parameter
and returns the distance between them.
    public static double distance(Point p1, Point p2){
        double distance=0;
        Segment s1 = new Segment(p1,p2);
        return distance=s1.module(s1);
    }*/


}