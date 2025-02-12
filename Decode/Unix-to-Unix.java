import java.util.*;
class UUDecoding
{
    public static void main(String s[])
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Ciphertext: ");
        String cipher=input.nextLine();
        String combined_binary="";
        String plain="";
        int j=0;

        for(int i=1;i<cipher.length();i++)
        {
            int ascii=0;
            String binary="";
            char c=cipher.charAt(i);

            if(c=='`')
            {
                continue;
            }
            ascii=c-32;

            while(ascii>0)
            {
                int rem=ascii%2;
                binary=rem+binary;
                ascii/=2;
            }

            while(binary.length()<6)
            {
                binary="0"+binary;
            }
            combined_binary+=binary;
        }

        StringBuffer combined_buffer=new StringBuffer(combined_binary);
        while(combined_buffer.length()%8!=0)
        {
            combined_buffer.deleteCharAt(combined_buffer.length() - 1);
        }

        combined_binary=combined_buffer.toString();

        String arr[]=new String[combined_binary.length()/8];

        for(int i=0;i<combined_binary.length()/8;i++)
        {
            String chunk="";
            int k1=0;
            while(k1<8)
            {
                char c=combined_binary.charAt(j);
                chunk+=c;
                j++;
                k1++;
            }
           arr[i]=chunk;
        }

        for(int i=0;i<arr.length;i++)
        {
            int k=0;
            int ascii=0;
            while(k<8)
            {
                char c=arr[i].charAt(k);
                if(c=='1')
                {
                    ascii+=Math.pow(2,7-k);
                    k++;
                }
                else
                {
                    k++;
                    continue;
                }
            }
            plain+=(char)ascii;
        }
        System.out.print("plaintext: "+plain);
    }
}
