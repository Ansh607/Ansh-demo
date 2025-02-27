package arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 5, 6, 9, 2};
        int x = 10;
        int n = arr.length;
        //solutiontwoSum
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {


                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);


                }
            }

        }
    }
}
