package QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] newArr = new int[]{324,100,-523,-100002,53,74,2,-10000};
        quickSort(newArr,0, newArr.length);
    }

    //хорошо работает с кэшом
    public static void quickSort(int[] arr, int from, int to){
        if (from < to){
            int divideIndex = toPieces(arr, from, to);

            quickSort(arr, from, divideIndex-1);

            quickSort(arr, divideIndex, to);
        }
    }

    public static int toPieces(int[] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];//опорный элемент

        while (arr[leftIndex] < pivot){
            leftIndex++;
        }

        while (arr[rightIndex] > pivot){
            rightIndex++;
        }

        if (leftIndex <= rightIndex) {
            //swap
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
        return leftIndex;
    }



    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


