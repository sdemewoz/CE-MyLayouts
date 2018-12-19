package ConditionHandling;

public class ecercise20 {

    public double calculatePercentage(double input, double total){
           return input*100/total;
    }

    public void grades(double phy, double bio, double chem, double math, double comp, double total) {
        ecercise20 per = new ecercise20();

        double input = phy + bio + chem + math + comp;

        double percentage = per.calculatePercentage(input, total);
        System.out.println("The percentage is: " + percentage);

        if (percentage < 0 && percentage > 100) {
            System.out.println("Ïnvalid mark");
        } else if (percentage >= 90 && percentage < 100) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else if (percentage < 40) {
            System.out.println("Grade F");
        }
    }
    public static void main(String[] args){
        ecercise20 resu = new ecercise20();

        resu.grades(-100, -88, -120,-99,78, 500);
    }
}
