import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the range of Even number: ");
        int n=sc.nextInt();
        for(int i=0;i<n*2;i++){
            if(i%2==0 && i%3==0){
                sum=sum+i;
            }
        }
        System.out.printf("Sum of Even numbers in the range upto %d which are divisible by 3 is: %d",n,sum);
    }
}