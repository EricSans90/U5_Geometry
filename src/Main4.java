public class Main4 {
    public static void main (String[] argv){
        // Point p = new Point(2, 3);
        //Rectangle r = new Rectangle(p, 4, 2);
        Rectangle r = new Rectangle();
        //System.out.println(p);
        System.out.println(r.toString());

        Point targetPoint = r.getP();
        targetPoint.setX(4);
        targetPoint.setY(7);
        r.setP(targetPoint);
        System.out.println(r);
        /* solution 2
        r.setNewPointPosition(4, 7);
        System.out.println(r);*/

        Point p = new Point(1, 1);
        Rectangle t = new Rectangle(p,8,6);
        System.out.println(t);

    }
}
