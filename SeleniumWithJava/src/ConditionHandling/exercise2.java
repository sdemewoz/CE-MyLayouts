package ConditionHandling;

import java.time.DayOfWeek;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.SplittableRandom;

import static java.util.Calendar.DAY_OF_MONTH;

public class exercise2 {

   /* public Object MonthDay;
    public Object DayOfWeek;
*/
   //Redo foe Exesice 18
    public void daysInMonth(int a){

        if (a >=1 && a<=12){
          // return DayOfWeek;

            int m1=a;
            String str= "" + m1;
            System.out.println(str);

            Calendar c = Calendar.getInstance();
           // System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
            System.out.println("Enter month: ");
            Scanner in = new Scanner(System.in);
            String m = in.nextLine();
            //int n = Integer.parseInt(m);
            System.out.println("month " + m + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");

      }
        else if (a == 2){
            System.out.println(28);
        }
       /* else {
            System.out.println("month " + m + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
        }*/
        else if(a==0 && a>12){
            System.out.println("Invalid month");
        }
        else {
            System.out.println("whatever");

        }
        //return a;
    }
}
