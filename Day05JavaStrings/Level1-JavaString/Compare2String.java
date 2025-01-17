import java.util.*;
public class Compare2String{

    public static boolean compareStringUsingCharAt(String str1, String str2){

        if(str1.length()!=str2.length()){
           return false;
        }

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
    }
    return true;
}

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string1: ");
        String str1 = input.next();
        System.out.println("Enter string2: ");
        String str2 = input.next();

        boolean charAtComparisionResult = compareStringUsingCharAt(str1, str2);
        boolean equalComparisionResult =  str1.equals(str2);

        System.out.println("charAtComparisionResult: " + charAtComparisionResult);
        System.out.println("equalComparisionResult:  " + equalComparisionResult);

        // Verify if both methods give the same result
        if (charAtComparisionResult == equalComparisionResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ between charAt() and equals() methods.");
        }
    }
}