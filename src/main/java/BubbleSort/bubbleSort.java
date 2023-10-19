package BubbleSort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{523,123,632,2,523,261,-1002,5,-100005};
        megaBubSort(array);
    }


    public static void megaBubSort(int[] arr){//сортирует с двух сторон
        boolean isSorted = true;//проверка на отсортированность
        while (isSorted){
            //Если ниже условия не прошли проверку - поменяет на false окончательно и закончит цикл
            isSorted = false;//пока не отсортирован
            for (int i = 0; i < arr.length-1; i++) {//сортируем с начала (здесь меньшие числа)
                if(arr[i] > arr[i+1]){//если предыдущий больше следующего - меняем местами
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = true;
                }
            }
            for (int i = arr.length-1;i>0;i--){//сортируем с конца (здесь бОльшие числа)
                if(arr[i] < arr[i-1]){//если следующий меньше предыдущего - меняем местами
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    isSorted = true;
                }
            }
            printArray(arr);
        }
    }

    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
