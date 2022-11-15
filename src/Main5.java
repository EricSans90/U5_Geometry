public class Main5 {
    public static void main (String[] argv){
        Point[] points;
        points = new Point[10];

        for (int i = 0; (i < 10); i++) {
            points[i]=new Point(i,i);
            System.out.println(points[i]);
        }
        System.out.println();
        Rectangle[] rectangles = new Rectangle[10];
        for (int i = 0; (i < 10); i++) {
            rectangles[i]=new Rectangle(points[i],1,1);
            System.out.println(rectangles[i]);
        }
    }
}
