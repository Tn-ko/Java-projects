package Algorithms;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        System.out.println(EuclideanAlgorithm(15, 5));
    }
    public static int EuclideanAlgorithm(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.print("НОД:");
        return (a);
    }
}
