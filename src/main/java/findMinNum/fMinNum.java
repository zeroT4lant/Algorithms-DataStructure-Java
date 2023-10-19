package findMinNum;

public class fMinNum {
    public static void main(String[] args) {
        int[] array = new int[]{523,123,632,2,523,261,-1002,5,-100005};

        findMin(array);


    }

    public static void findMin(int[] array){
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println(minValue + " & " + minIndex); ;
    }
}
