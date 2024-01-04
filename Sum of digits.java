import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        while(a>0){
           int r=a%10;
           sum=sum+r;
           a=a/10;
        }
        System.out.println(sum); 
                             // if the { is outside the loop it means it will print all the sum ex:1234 output will be 4 7 9 10
          } 
}  
