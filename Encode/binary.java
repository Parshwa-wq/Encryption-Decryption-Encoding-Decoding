import java.util.*;
class binary
{
    static Scanner input=new Scanner(System.in);
    static String plain;
    public static void main(String s[])
    {
        System.out.print("Plaintext: ");
        plain=input.nextLine();

        String arr[]=new String[plain.length()];

        System.out.print("Binarytext: ");
        for(int i=0;i<plain.length();i++)
        {
            char c=plain.charAt(i);
            int ascii=c;
            String binary="";

            while(ascii>0)
            {
                int rem=ascii%2;
                binary=rem+binary;
                ascii/=2;
            }

            while(binary.length()!=8)
            {
                binary="0"+binary;
            }

            arr[i]=binary;
        }

        for(String binary_arr:arr)
        {
            System.out.print(binary_arr);
        }
    }
}
