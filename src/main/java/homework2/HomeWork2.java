package homework2;

public class HomeWork2 {


        // Задание 1
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
    }
