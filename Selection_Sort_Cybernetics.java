package com.marlen.java.lesson_1.Lesson7_1.Home7.Sorting.Selection_Sort;

// Кружок факультета Кибернетики

public class Selection_Sort_Cybernetics {
    public static void main(String a[]) {
        int[] arr1 = {544, 10, 34, 2, 56, 7, 67, 5, 88, 42,0};
       // int[] arr2 = selectionSort(arr1);
        selectionSort(arr1);
        for (int i : arr1) {
            System.out.print(i+", ");
        }
    }

    public static void selectionSort(int a[]){
        int n=a.length;
        for (int i = 0; i <n-1 ; i++) {
            // находим min элемент из еще не отсортированных элементов
            int m=i;
            int d=0;
            for (int j = i+1; j <n ; j++) {
                if(a[j]< a[m]){
                    m=j;
                }
            }
            // ставим min элемент на нужное место
            d=a[i];
            a[i]=a[m];
            a[m]=d;
        }
    }
}
