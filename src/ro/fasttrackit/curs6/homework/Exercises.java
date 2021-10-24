package ro.fasttrackit.curs6.homework;

public class Exercises {
    public static void main(String[] args) {
        int[] array = new int[]{2176, 72, 555, 89, 12, 0, 13, 65, 1};
        int i = 0;
        int suma;
        int number;
        System.out.println((sum(array)));
        System.out.println(even(array));
        System.out.println(max(array));
    }

    public static int sum(int[] array) {
        int i;
        int suma = 0;
        for (i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma;
    }

    public static int even(int[] array) {
        int i;
        int count = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int max(int[] array) {
        int i;
        int number = 100;
        for (i = 0; i < array.length; i++) {
            if (array[i] > number) {
                return array[i];
            }
        }
        return number;
    }
}