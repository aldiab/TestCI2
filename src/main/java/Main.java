import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        System.out.println(cubeX(5));
        System.out.println(squareX(5));
        System.out.println("A new build");

    }
   
    public static int cubeX(int x){
        return x * x * x;
    }

    public static int squareX(int x){
        return x * x ;
    }
}
