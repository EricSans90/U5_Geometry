public class Main4 {
    public static void main (String[] argv){
        Point p = new Point(2, 3);
        Rectangle r = new Rectangle(p, 4, 2);
        System.out.println(r.toString());
        p.setX(4);
        p.setY(7);
        System.out.println(r.toString());
        // System.out.println(p);

        //Point t = new Point (r.getPoint().getX(),r.getPoint().getY());
        //System.out.println(t);
        //System.out.println(r.toString());
        //Rectangle R = new Rectangle();
        //System.out.println(r.toString());
    }
}
