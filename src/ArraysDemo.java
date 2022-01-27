//Продемонстрировать применение некоторых методов из класса Arrays
import java.util.Arrays;


public class ArraysDemo {
    public static void main(String[] args) {
        //выделить и инициализировать массив
        int array[] = new int[10];
        for(int i = 0; i<10; i++)
            array[i] = -3*i;

        //вывести,отсортировать и снова вывести содержимое массива
        System.out.print("Исходный массив: ");
        for(int i:array) {System.out.print(" ["+i+"] ");}
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        for(int i:array) {System.out.print(" ["+i+"] ");}

        System.out.println();
        //заполнить массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Массив после вызова метода fill(): ");
        for(int i:array) {System.out.print(" ["+i+"] ");}

        //Отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.print("Массив после повторной сортировки: ");
        for(int i:array) {System.out.print(" ["+i+"] ");}
        System.out.println();
        //выполнить двоичный поиск значения -9
        System.out.print("Значение -9 находится на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);

    }
}
