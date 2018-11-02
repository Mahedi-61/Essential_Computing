// find the GCD of two numbers with sign.

import java.lang.Math;

public class CheckingVowel{
    public static void main(String[] args) {
        char alphabet = 'a';
        boolean isVowel = false;

        switch(alphabet){
            case 'a' :
                isVowel = true;
                System.out.println("Char is a");
                break;
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            isVowel = true;
            break;

            default :
            isVowel = false;

        }


        if(isVowel == true){
            System.out.println("Vowel found !!");
        }else{
            System.out.println("Vowel not found !!");
        }
    }
}