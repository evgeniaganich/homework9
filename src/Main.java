import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        System.out.println("Задание 2");
        System.out.println();

        int maxCost = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCost) {
                maxCost = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxCost + " рублей");

        int minCost = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCost) {
                minCost = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей");
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();

        int days = 30;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        double averageSum = (double) sum1 / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
        System.out.println();
        System.out.println("Задание 4");
        System.out.println();


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();


    }


}
