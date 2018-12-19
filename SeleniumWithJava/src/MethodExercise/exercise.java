package MethodExercise;

public class exercise {

    public static void main(String[] args){

        Testing obj = new Testing();

        int z, w, y, n, f, m, c, d, e, a;
        //(2+3)*(7-5)
        z = obj.sum(2, 3);
        w = obj.sub(7, 5);
        y = obj.multiply(z, w);
        System.out.println(y);

        //(square 2) + (square 5)
       n = obj.square(2);
       m = obj.square(5);
       f = obj.sum(n, m);
       System.out.println(f);

       //(2+8)*(2+5+7)
        c = obj.sum(2,8);
        d = obj.sum(2,5);
        e = obj.sum(d, 7);
        a = obj.multiply(c, e);
        System.out.println(a);

        //Number swapping
        //approach-1: using 3rd variable
        int i = 2;
        int j = 4;
        int k = i; //k is 2
     //   i = j; //i is 4
    //    j = k; //j is 2
   //     System.out.println("i is " + i + " and j is " + j);

        //approach-2: using 3rd variable
        i = i + j; //i is 6
        j = i - j; //j = 6-4 = 2
        i = i - j; //i = 6 -2 = 4
        System.out.println("i is " + i + " and j is " + j);
    }
}
