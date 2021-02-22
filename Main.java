  /*     ///////////////////////////////////////////////////////////////////////////////////////////////////////








    ////////////////////////////////////////////////////////////////////////////////////////////////////     */


package com.company;
import java.util.Scanner;        // импорт сканера


public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);              // Объявляем Scanner для выбора метода сортировки
        System.out.println("Choosing a sorting method: number 1 - bubble sort; number 2 - selection sort; number 3 - insertion sort");
        int number = scan.nextInt();    // Приравниваем введеное значение к номеру сортировки

        Scanner in = new Scanner(System.in);  // Объявляем Scanner для выбора размера массива и элементов массива
        System.out.println("Enter array length: ");  // вводим размер массива
        int size = in.nextInt(); //Приравниваем введеное значение к размеру массива
        int[] array = new int[size];
        System.out.println("Insert array elements:"); // вводим числа для массива


        for (int i = 0; i < size; i++)
            array[i] = in.nextInt();

        System.out.print("Sorted:" + "\n");

        if (number == 1) {
            bubblesort(array, size);
            for (int i : array)
                System.out.print(i + " ");  //выводим
        }

       if (number == 2) {
        selectionsort(array, size);
        for (int i : array)
            System.out.print(i + " ");  //выводим
       }

        if (number == 3) {
            insertionsort(array, size);
            for (int i : array)
                System.out.print(i + " ");  //выводим
        }

        System.out.print("\n");

        if (number == 1) {
            reversebubblesort(array, size);
            for (int i : array)
                System.out.print(i + " ");  //выводим
        }

        if (number == 2) {
            reverseselectionsort(array, size);
            for (int i : array)
                System.out.print(i + " ");  //выводим
        }

        if (number == 3) {
            reverseinsertionsort(array, size);
            for (int i : array)
                System.out.print(i + " ");  //выводим
        }






    }





    public static void bubblesort(int[] array, int size) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int index = 0; index < size - 1; index++) {
                if (array[index] > array[index+1]) {
                    temp = array[index];
                    array[index] = array[index+1];
                    array[index+1] = temp;
                    sorted = false;
                }
            }
        }

    }


    public static void selectionsort(int[] array, int size) {
        for (int min, temp, index = 0; index < size - 1; index++) {
            min = index;
            for (int count = index + 1; count < size; count++)
                if (array[count] < array[min])
                    min = count;
            temp = array[min];
            array[min] = array[index];
            array[index] = temp;
        }
    }



    public static void insertionsort(int array[], int size) {
        for (int min, index = 0; index < size ; index++) {
            min = array [index];
            int count = index - 1;
            while ((count > -1) && (array[count] > min)) {
               array [count+1] = array[count];
                count--;
            }
            array [count+1] = min;
            }
        }


    public static void reversebubblesort(int[] array, int size) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int index = 0; index < size - 1; index++) {
                if (array[index] <= array[index+1]) {
                    temp = array[index];
                    array[index] = array[index+1];
                    array[index+1] = temp;
                    sorted = false;
                }
            }
        }

    }





    public static void reverseselectionsort(int[] array, int size) {
        for (int min, temp, index = 0; index < size - 1; index++) {
            min = index;
            for (int count = index + 1; count < size; count++)
                if (array[count] > array[min])
                    min = count;
            temp = array[min];
            array[min] = array[index];
            array[index] = temp;
        }
    }



    public static void reverseinsertionsort(int array[], int size) {
        for (int min, index = 0; index < size ; index++) {
            min = array [index];
            int count = index - 1;
            while ((count > -1) && (array[count] < min)) {
                array [count+1] = array[count];
                count--;
            }
            array [count+1] = min;
        }
    }





    }
