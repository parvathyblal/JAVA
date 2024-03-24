import java.util.Scanner;
class palindrome {
    public static void main(String args[])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();


        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);

        }
        if(rev.toLowerCase().equals(str.toLowerCase()))
        {
            System.out.println("The string is palindrome");

        }
        else {
            System.out.println("The string is not  palindrome");
        }
    }
}


