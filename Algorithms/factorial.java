package Algorithms;

public class factorial {
    public static void main(String[] args) {
        System.out.println(findFac(4));
    }
    public static int findFac(int factorial) {// стек содержит factorial=3, затем 2 и 1
        //после второго вызова функции управление переходит к factorial=2, потом к factorial=1, который будет извлечен 1-ым и возвратит 1
        // второй вызов х=2 => 2*fac(1)=2, затем последний вызов 3*fac(2)=6
        if (factorial == 0) // х=3,2,1
            return 1;// х=3,2,1
        return factorial * findFac(factorial - 1);// рекурсия, умножаем последний элемент с последующим, пока factorial == 0
    }
}
