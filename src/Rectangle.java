public class Rectangle extends Point {

    private Point p;
    private int width=0;
    private int height=0;

    public Rectangle(Point p, int newWidth, int newHeight) {
        // super(p.getX(), p.getY());
        this.width = newWidth;
        this.height = newHeight;
        this.p = p;
    }
    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
        this.p = new Point();
    }

    public Rectangle(Point p1, Point p2) {
        // super(p.getX(), p.getY());
        this.p = p1;
        this.width = p2.getX() - p1.getX();
        this.height = p2.getY() - p1.getY();
    }


    public void setNewPointPosition(int x, int y) {
        this.p.setX(x);
        this.p.setY(y);
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    //public Point getPoint(){
    //    return Point p;
    //}

    /*method I used for testing before
    public String toString(){
        return "The left corner is ("+ this.p.getX()+","+this.p.getY()+"). The width is: "+width+", and the height is: "+height";
    } */

    //new toString
    public String toString(){

        return "("+ this.p.getX()+","+this.p.getY()+"). Width: "+width+" height: "+height;
    }

}
