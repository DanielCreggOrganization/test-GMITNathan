package ie.gmit.scannerpack;

public class FibonacciWhileLoop {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        int i = 1;
        while (i <= n){
            System.out.print(t1+" ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            ++i;
        }
        System.out.println("");
    }
}