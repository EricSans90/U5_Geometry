public class TestMyTriangle {

    public static void main(String[] argv) {

        Triangle t1 = new Triangle(0, 0, 2, 0, 0, 2 );
        Triangle t2 = new Triangle(0, 0, 2, 0, 0, 3 );
        System.out.println(t1);
        System.out.println("t1 perimeter is: "+t1.getPerimeter());
        System.out.println("t1 is: "+t1.printType());
        System.out.println("t2 is: "+t2.printType());
        /* IMPORTANT COMMENT as a triangle equilateral doesn't exist with all the vertices with integer coordinates
         (remember Pick's theorem if all vertices are integers then the area is rational number, but with
          pythagoras we have that the hypotenuse is square root of 2, which is irrational, se we get a contradiction here)
        I cannot check if it works with Point being created as integer coordinates, but as it does work with scalene
        and isosceles I will assume it does work with equilateral too */

        /*Segment s1=new Segment(t1.getV1(),t1.getV2());
        System.out.println(s1.module());
        Segment s2=new Segment(t1.getV2(),t1.getV3());
        System.out.println(s2.module());
        Segment s3=new Segment(t1.getV1(),t1.getV3());
        System.out.println(s3.module());*/


    }

}
