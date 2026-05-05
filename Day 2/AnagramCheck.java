import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args){
        String str1 = "cat";
        String str2 = "act";

        // Step 1: Length check
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        // Step 2: Convert to char array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Step 3: Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare arrays
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}