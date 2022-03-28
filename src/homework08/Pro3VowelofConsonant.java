package homework08;
import java.util.Scanner;
public class Pro3VowelofConsonant {
    public static void vowel(){
        int i = 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = scr.next().charAt(0);
        //use switch method tp express the 'ch'
        switch (ch){
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                i++;
        }
        if(i==1)
            System.out.println(ch + "is Vowel");
        else
            if((ch>='a' && ch<='z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println(ch + "is Consonant");
            else
                System.out.println("No an Alphabet");

    }

    public static void main(String[] args) {
      vowel();
    }
}
