package homework2;

public class HomeWork2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 10, 10};

        fillArray(7, arr);          // Задание 3
        increaseArray(3, arr);      // Задание 4
        sumGreaterThanFive(arr);    // Задание 2
        compareArrayHalves(arr);    // Задание 5
        printStringTimes(3, "Hi");  // Задание 1
    }

    // Задание 1: печать строки указанное количество ра3
    public static void printStringTimes(int times, String text) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    // Задание 2: сумма элементов массива больше 5
    public static void sumGreaterThanFive(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    // Задание 3: заполнение массива указанным числом
    public static void fillArray(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    // Задание 4: увеличение каждого элемента массива
    public static void increaseArray(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
    }

    // Задание 5: сравнение сумм половин массива
    public static void compareArrayHalves(int[] array) {
        int mid = array.length / 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < mid; i++) {
            leftSum += array[i];
        }

        for (int i = mid; i < array.length; i++) {
            rightSum += array[i];
        }

        if (leftSum > rightSum) {
            System.out.println("Первая половина больш");
        } else if (rightSum > leftSum) {
            System.out.println("Вторая половина больше");
        } else {
            System.out.println("Суммы равны");
        }
    }
}
