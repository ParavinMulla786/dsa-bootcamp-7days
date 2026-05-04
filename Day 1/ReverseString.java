class ReverseString {

    static void reverseArray(int arr[], int n) {
        int start = 0;        // first index
        int end = n - 1;      // last index

        while (start < end) {

            // Step 1: store value
            int temp = arr[start];

            // Step 2: swap
            arr[start] = arr[end];
            arr[end] = temp;

            // Step 3: move pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        reverseArray(arr, arr.length);

        // print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}