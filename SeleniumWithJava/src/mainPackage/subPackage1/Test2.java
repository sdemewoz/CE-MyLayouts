package mainPackage.subPackage1;
import mainPackage.subPackage2.Test3; //import in java, using in C#

public class Test2 {

    public static void main(String[] args) {
        Test1 obj = new Test1();  //when calling a method, the class name should also be intialized, even from the same class.
        obj.getSum();
        obj.testing();

        //if the method is called from different package, the class still has to be initialized and the package should be imported
        Test3 obj1 = new Test3();
        obj1.newPackage();
    }
}
