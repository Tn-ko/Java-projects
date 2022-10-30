package Algorithms;

public class algorithms {
    public static void main(String[] args) {
        int[] stat = {0, 200, 375, 550, 750, 950};
        System.out.println(count(stat, 400));// количество км, которое мы можем проехать с полным баком
    }
    public static int count(int[] stations, int capacity) {
        int result = 0;
        int currentStop = 0;

        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;
            while (nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;
            if (currentStop == nextStop)
                return -1;
            result++;
            currentStop = nextStop;
        }
        return result;
    }
}




