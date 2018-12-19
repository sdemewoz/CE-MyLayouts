package ConditionHandling;

public class exercise {
    public void largestNumber(int a,int b, int c)
    {
        if (a>b || a>c){
            System.out.println(a + " is greatest");
        }
            else if(b>a && b>c){
            System.out.println(b + " is greatest");
        }
            else {
            System.out.println(c + " is greatest");
        }
    }

    public void lowestNumber(int a,int b, int c) {
        if (a < b || a < c) {
            System.out.println(a + " is lowest");
        } else if (b < a && b < c) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }
    }

    public void divisible(int i){
        if (i%5==0 && i%11==0){
            System.out.println(i + " is divisible by 5 and 11");
        }
            else if (i%11==0){
            System.out.println(i + " is divisible by 11");
        }
            else if (i%5==0){
            System.out.println(i + " is divisible by 5");
        }
            else {
            System.out.println(i + " is not divisible by both");
        }
    }
}
