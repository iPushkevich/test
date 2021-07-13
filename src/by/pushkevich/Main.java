package by.pushkevich;


import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] m = {1, 6, 3, -4, 34, -9, 0};


//
//        selectSort(m);
//        bubbleSort(m);
//        insertSort(m);


    }

    static void bubbleSort(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j + 1];
                    mass[j + 1] = mass[j];
                    mass[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(mass));
    }

    static void selectSort(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[minIndex] > mass[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int tmp = mass[i];
                mass[i] = mass[minIndex];
                mass[minIndex] = tmp;
            }
        }

        System.out.println(Arrays.toString(mass));
    }

    static void insertSort(int[] m) {
        for (int i = 1; i < m.length; i++) {
            int current = m[i];
            int j = i - 1;

            while (j >= 0 && current < m[j]) {
                m[i] = m[j];
                j--;
            }

            m[i] = current;
        }

        System.out.println(Arrays.toString(m));
    }

    static void m(byte b) {
        System.out.println("byte");
    }

    static void m(short s) {
        System.out.println("Short");
    }

    static void m(char c) {
        System.out.println("char");
    }

    static void m(int i) {
        System.out.println("int");
    }

    static void m(long l) {
        System.out.println("long");
    }

    static void m(double d) {
        System.out.println("double");
    }
}


