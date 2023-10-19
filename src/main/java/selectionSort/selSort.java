package selectionSort;//APPROVED

public class selSort {
    public static void main(String[] args) {
        int[] newArr = new int[]{324,100,-523,3,53,74,2,-10000};
        selectionSort(newArr);
    }

    //искать минимальное
    //отправлять в начало
    //увеличивать на одну единицу индекс

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //смещаем область поиск минимального значения в массиве
           int index = min(arr,i);//получили индекс минимального значения среди этого обрезанного массива
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        printArray(arr);
    }

    public static int min(int[] arr,int indexStart){//найти минимальное в обрезанном массиве
        int minVal = arr[indexStart];//начальное значение
        int minIndex = indexStart;//первый индекс массива будет
        for (int i = indexStart; i < arr.length; i++) {
            if (minVal > arr[i]){
                minVal = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
