import java.util.*;
class Binary_decode
{
    static Scanner input=new Scanner(System.in);
    static String plain="";
    static String binary;
    static void decode(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int j=0;
            int ascii=0;
            while(j<8)
            {
                char c=arr[i].charAt(j);
                if(c=='1')
                {
                    ascii+=Math.pow(2,7-j);
                    j++;
                }
                else
                {
                    j++;
                    continue;
                }
            }
            plain+=(char)ascii;
        }
        System.out.println("Plaintext: "+plain);
      System.out.print("----------------------");
    }
    public static void main(String s[])
    {
        System.out.print("binary: ");
        binary=input.nextLine();
        int j=0;

        while(binary.length()%8!=0)
        {
            System.out.print("pls enter binary values in the chunks of 8 bit.\nEnter agian: ");
            binary=input.nextLine();
        }

        String arr[]=new String[binary.length()/8];

        for(int i=0;i<arr.length;i++)
        {
            String chunk="";
            int count=0;
            while(count<8)
            {
                char c=binary.charAt(j);
                j++;
                count++;
                chunk+=c;
            }
            arr[i]=chunk;
        }

        decode(arr);
    }
}
