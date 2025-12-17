package homework2;

public class HomeWork2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        fillArray(7, arr);
    }

    // Задание 1
    public static void printStringTimes(int times, String text) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    // Задание 2
    public static void sumGreaterThanFive(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    //  Задание 3
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
}
