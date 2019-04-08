// find whether a number is palindrome or not 

public class Palindrome{

public static void main(String[] args){
    int originaNumber = 303;
    int num = originaNumber;
    int reverseNumber = 0, remainder = 0;

    // logic for getting reverse number 
    while (num != 0){
        remainder = num % 10; // 2
        reverseNumber = reverseNumber * 10 + remainder;
        num = num / 10; // 0
    }

    if(originaNumber == reverseNumber){
        System.out.println("Ureka!! palindrome");
    
    }else{
        System.out.println("OH!! not palindrome");
    }
}
}