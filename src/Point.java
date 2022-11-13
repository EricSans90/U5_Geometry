public class Point {
    //2 int fields
    private int x = 0;
    private int y = 0;

    //a no parameter constructor
    public Point (){
        x=0;
        y=0;
    }

    //a 2 type int parameter constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }

    //public method to set non negative X
    //public void setX(int newX){
    //    if newX (<0){
    //        x=-newX;
    //    } else {
    //        x=newX;
    //    }
    //}

    public void setX(int newX){
        x=newX;
    }

    public void setY(int newY){
        y=newY;
    }
}