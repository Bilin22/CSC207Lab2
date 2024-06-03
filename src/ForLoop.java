public class ForLoop {
    public static int oddSum(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5};
        int result = oddSum(myArr);
        System.out.println(result);
    }
}


