package MethodExercise;

import javax.swing.text.html.parser.Parser;

public class Testing {

    //create a method which performs small task in order to reuse it for another task/person
    //exercise to sum, subtract and multiply

    //variables which is created a method is used only by its own method
    public int sum(int a, int b)
    {
        int sumresult = a+b;
        return sumresult;
    }
    public int sub(int a, int b){
        int subresult = a-b;
        return subresult;
   }
   public int multiply(int a, int b){

        int multi = a*b;
        //System.out.print(multi);
       return multi;
   }
   public int square(int a)
   {
       int squ = (int) Math.pow(a, 2);
       return squ;
   }
}
