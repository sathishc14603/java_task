package Assignment_3.UnCondition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      1.  Write a program to find second occurrence of a given number in an array
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int cnt=0;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                cnt++;
                if(cnt==2){
                    System.out.println("Accure");
                    return;
                }
            }
        }
        System.out.println("Not Accure");
    }
}
class Primenumber{
    public static void main(String[] args) {
//        2. Write a program to print prime numbers between 1 to 30
            System.out.println(2);
            for(int i=3;i<=30;i++){
                int val=(int)Math.sqrt(i);
                boolean ptr=false;
                for(int j=2;j<=val;j++){
                    if(i%j==0){
                        ptr=true;
                         break;

                    }
                }
                if(!ptr){
                    System.out.println(i);
                }
            }
    }
}
class Sum_even{
//    3. Write a program to find the sum of even numbers only in a given array. Use continue.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2==0)continue;
                sum+=arr[i];
            }
            System.out.println(sum);

        }
}
