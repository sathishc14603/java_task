package Assignment_4.String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Create a program to count vowels in a given string using string functions
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("No of Vowel Count = "+ count_vowels(str));
    }
    public static  int count_vowels(String s){
        s=s.toLowerCase();
        int cnt=0;
        for(char ch:s.toCharArray()) if(ch=='a'||ch=='e' || ch=='o' || ch=='u') cnt++;
        return cnt;
    }
}
class ReverseString{
    public  static  void main( String[] args){
        Scanner sc= new Scanner(System .in);

//        2. Write a program to reverse the characters of a string.

        String str=sc.nextLine();
        String rev_string="";
        for(int i=0;i<str.length();++i){
            rev_string=str.charAt(i)+rev_string;
        }
        System.out.println("Revese Order : "+ rev_string);
    }
}
class ReverseWord{
    public static void main(String[] args) {
//        3. Write a program to reverse the words in a sentence.
        Scanner sc= new Scanner(System.in);
        String words=sc.nextLine();
        System.out.println(reveseWord(words,"",""));

    }
    public static String reveseWord(String s,String word,String ansstr){
        if(s.isEmpty()){
            return word+ansstr;
        }
        if(s.charAt(0)==' '){
            ansstr=word+" "+ansstr;
            word="";

        }
        return reveseWord(s.substring(1),word+s.charAt(0),ansstr);
    }
}
class EmailVerify{
//    4. Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String email=sc.nextLine();
    if(checkValid(email)){
        System.out.println("Valid Email Address: "+email);
        }
    else{
        System.out.println("Not a Valid Email Adress");
    }
    }
public static boolean checkValid(String email){
    if(email.isEmpty() || email.length()< 8) return false;
     int atindex=email.indexOf("@");
     if(atindex<0 || atindex!=email.indexOf("@") || atindex==0 || atindex==email.length()-1){
         return false;
     }
     int dot=email.indexOf(".");
     if(dot==0) return false;
     dot=email.lastIndexOf(".");
     String com=email.substring(dot+1);
     if(!com.equals("com")) return false;
     if(!email.substring(atindex,dot).equals("@gmail")) return false;

    return true;
    }
}

class CapitalizeWord{

public static void main(String[] args) {
//    5. Write a program to capitalize the first letter of each words in a sentence.
    Scanner sc=new Scanner(System.in);
    String word=sc.nextLine();
    System.out.println(word);
    String PascalCase="";

    PascalCase+=(char)(word.charAt(0)-charngeLowertoUpper(word.charAt(0)));
    for(int i=1;i<word.length();++i){
        PascalCase+=word.charAt(i);
        if(word.charAt(i)==' '){
            PascalCase+=(char)(word.charAt(i+1)-charngeLowertoUpper(word.charAt(i+1)));
            i++;
        }
    }
    System.out.println(PascalCase);

    }
    public static int  charngeLowertoUpper(char c){

        if(c>=97)return 32;
        return 0;
    }
}

