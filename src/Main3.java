public class Main3 {
    public static void main(String[] argv){
        Segment s1= new Segment();
        Point p1= new Point(4,5);
        Point p2= new Point(6,8);

        s1.setStartPoint(p1);
        s1.setEndPoint(p2);
        s1.setOffset(4,4);
        System.out.println(s1);
        System.out.println("The module of s1 is: "+ s1.module());
    }
}
