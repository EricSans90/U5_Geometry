public class MainPolygon {
    public static void main(String[] argv) throws Exception {
        //Testing
        Point p1= new Point(4,5);
        Point p2= new Point(6,8);
        Point p3= new Point(1,3);
        Point p4= new Point(4,7);
        Point[] arrP = new Point[10];
        arrP[0] = new Point(0, 0);
        arrP[1] = new Point(0, 1);
        arrP[2] = new Point(1, 1);
        arrP[3] = new Point(1, 0);
        //Polygon pol1 = new Polygon(p1,p2,p3);
        //System.out.println(pol1);
        Polygon myPolygon1, myPolygon2;
        //Testing constructor of points
        //myPolygon1 = new Polygon (p1,p2,p3,p4);
        myPolygon2 = new Polygon ();
        // for printing points in the array
        /*int i;
        for (i=0;i< arrP.length && arrP[i]!=null;i++){
            System.out.print(arrP[i]);
        }*/
        System.out.println();
        System.out.println(myPolygon2.toString(arrP));
        myPolygon2.setOffset(5,5,arrP);
        System.out.println(myPolygon2.toString(arrP));

        System.out.println(myPolygon2.getLength(arrP));

        /* testing arrya constructor
        Polygon myPolygon3 = new Polygon(arrP);
        System.out.println(myPolygon3.toString(arrP));*/


    }
}
