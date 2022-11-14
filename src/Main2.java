public class Main2 {
    public static void main(String[] argv){

        Point p1 = new Point (4,5);
        Point p2 = new Point (6,8);

        //p1.setOffset(4,4);
        //p2.setOffset(4,4);
        //printing both points
        System.out.println(p1);
        System.out.println(p2);
        //printing both points with to string
        //System.out.println("Point 1 is= "+p1.toString());
        //System.out.println("Point 2 is= "+p2.toString());

        //Testing module method
        //Segment stest = new Segment (p1,p2);
        //System.out.println(stest.module(stest));

        //Testing module toString
        //Segment stest = new Segment (p1,p2);
        //System.out.println(stest);

        //Testing Segment offSet
        Segment stest = new Segment (p1,p2);
        stest=stest.setOffset(2,2);
        System.out.println(stest);
    }
}
