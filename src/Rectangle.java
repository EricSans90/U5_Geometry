public class Rectangle extends Point {
    private int width=0;
    private int height=0;

    public Rectangle(Point p, int width, int height) {
        super(p.getX(), p.getY());
        this.width = width;
        this.height = height;
    }

    /*public Rectangle(Point p, int newWidth, int newHeight) {
            // super(p.getX(), p.getY());
            // super
            this.width = newWidth;
            this.height = newHeight;
            this.p = p;
        }*/
    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;

    }

    public Rectangle(Point p1, Point p2) {
        super(p1.getX(), p1.getY());
        this.width = p2.getX() - p1.getX();
        this.height = p2.getY() - p1.getY();
    }


    public void setNewPointPosition(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

     /*method I used for testing before
    public String toString(){
        return "The left corner is ("+ this.p.getX()+","+this.p.getY()+"). The width is: "+width+", and the height is: "+height";
    } */

    //new toString
    public String toString(){

        return "("+ this.getX()+","+this.getY()+"). Width: "+width+" height: "+height;
    }

    public double getArea(){
        return (this.width)*(this.height);
    }

    public Point getTopLeftPoint() {
        Point aux = new Point();
        aux.setX(this.getX());
        aux.setY(this.getY()+this.height);
        return aux;
    }
    public Point getTopRightPoint() {
        Point aux = new Point();
        aux.setX(this.getX()+this.width);
        aux.setY(this.getY()+this.height);
        return aux;
    }
    public Point getBottomLeftPoint() {
        return this;
    }
    public Point getBottomRightPoint() {
        Point aux = new Point();
        aux.setX(this.getX() + this.width);
        aux.setY(this.getY());
        return aux;
    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
}
