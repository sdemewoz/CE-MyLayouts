package mainPackage.subPackage1;

public class Test1 {

    //constants: the values which will never be changed. They are initialized using final. It is mandatory to initialise the value.
    final int i=1;

    //variables: are used to hold some data which the values could be change later.
    int j=2;
    int sum = i+j;

    public void getSum() {
        System.out.println("Welcome to Java: " + sum);
    }

    public void testing(){
        System.out.println("Another method to be called");
    }
}
