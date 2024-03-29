package src.com.javaconcepts;
//Advantages:
//Enhanced Readability
//Improved code organization
//Increased flexibility
//Code reusability
//VVI: return type should be same
public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        int r2=obj.add(2,3);
        System.out.println("Adding 3 numbers:"+r2);
        System.out.println(r2);
        int r3=obj.add(1,2,3);
        System.out.println("Adding 3 numbers:"+r3);
        double r4=obj.add(2.5,3.1,5.99);
        System.out.println(r4);
    }

}
class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, double n2, double n3){
        return n1+n2+n3;
    }


}