public class Main{
    public static void main(String args[]){
        int number = 987654321, rem, rev=0;
        while(number !=0){
            rem = number%10;
            rev = rev*10+rem;
            number = number/10;
        }
        System.out.println(rev);
    }
}