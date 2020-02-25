public class SelectiveIteration{ 

    public static void main(String[] args) {
    
    int num = 1777;
    int i = 0;
      while (i++ < num) {
      
        if(i % 3 == 0 || (i+5)%7 == 0 || i%10 == 0){   
        continue;
        }
       System.out.println(i);
     
      }

 

   }
}
