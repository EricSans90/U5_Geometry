public class Main4 {
    public static void main (String[] argv){
        // Point p = new Point(2, 3);
        //Rectangle r = new Rectangle(p, 4, 2);
        Rectangle r = new Rectangle();
        //System.out.println(p);
        System.out.println(r);
        r.setX(4);
        r.setY(7);
        System.out.println(r);
        System.out.println();
        // I could use the Method I created setNewPointPosition

        Point p = new Point(1, 1);
        Rectangle t = new Rectangle(p,8,6);
        System.out.println(t);
        System.out.println();


        Point p1 = new Point(2, 2);
        Point p2 = new Point(5, 8);
        Rectangle u = new Rectangle(p1,p2);
        System.out.println(u);
        System.out.println();

        //System.out.println("Last rectangle's point is: "+u);

        /* TESTING
        System.out.println(u.getTopLeftPoint());
        System.out.println(u.getTopRightPoint());
        System.out.println(u.getBottomLeftPoint());
        System.out.println(u.getBottomRightPoint());
        System.out.println(t.getArea()); */
        Point o = new Point(5,6);
        Rectangle w = new Rectangle(o,10,8);
        System.out.println(w);
        System.out.print("Top-Left: ("+w.getTopLeftPoint().getX()+","+w.getTopLeftPoint().getY()+") ");
        System.out.print("Top-Right: ("+w.getTopRightPoint().getX()+","+w.getTopRightPoint().getY()+") ");
        System.out.print("Bottom-Left: ("+w.getBottomLeftPoint().getX()+","+w.getBottomLeftPoint().getY()+") ");
        System.out.print("Bottom-Right: ("+w.getBottomRightPoint().getX()+","+w.getBottomRightPoint().getY()+") ");
        System.out.println();
        //System.out.println(w.getWidth());


    }
}
