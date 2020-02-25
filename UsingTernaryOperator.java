public class UsingTernaryOperator{ 

    public static void main(String[] args) {

           float num = 7.77f;
           
String message = num <= 0 || num >= 1000000
               ? "Small"
               : "Large";
          System.out.println(message);
         

 
    }
}