package ConditionHandling;

public class IfElseIf {

    public void A(int x)
    {
        if (x%2 == 0 && x == 0 ){
            System.out.println("Number is even");
        }
        else if (x < 0 || x == -1) {
            System.out.println("Number is zero");
        }
       /* else if (x < 0){
            System.out.println("Number is negative");
        }*/
        else{
            System.out.println("Number is odd");
        }
    }
}
