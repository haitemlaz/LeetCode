public class Palindrome {
    public static boolean isPalindrome(int x) {
        boolean solution=false;


        int n=x;
        int m=0;

     while(n/10>0){

         m=m*10+n%10;

         n=n/10;
     }
        m=m*10+n%10;
if (x<0){
    return false;
}


        return x==m;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(525));

    }
}