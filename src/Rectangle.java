public class Rectangle extends Point {
    private Point p;
    private int width=0;
    private int height=0;

    public Rectangle(Point p, int width, int height) {
        super();
        this.width = width;
        this.height = height;
        this.p = p;
    }
    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }

    //public Point getPoint(){
    //    return Point p;
    //}

    public String toString(){
        return "The left corner is ("+ this.p.getX()+","+this.p.getY()+"). The width is: "+width+", and the height is: "+height+")";
    }
}
