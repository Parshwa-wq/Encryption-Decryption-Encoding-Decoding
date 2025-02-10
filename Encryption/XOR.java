import java.util.*;
class XOR
{
    static Scanner input=new Scanner(System.in);
    public static void main(String s[]) 
    {
        String cipher;
        String key;
        String plain="";
        
        int count=0;
        System.out.print("Ciphertext: ");
        cipher=input.nextLine();

        System.out.print("Key: ");
        key=input.next();
        input.nextLine();

        if(cipher.length()>key.length())
        {
            while(key.length()<cipher.length())
            {
                char c=key.charAt(count);
                count++;
                key+=c;
                if(count==key.length()-1)
                {
                    count=0;
                }
            }
        }

        for(int i=0;i<cipher.length();i++)
        {
            String binary_cipher="";
            String binary_key="";
            String XOR="";
            char c1=cipher.charAt(i);
            char c2=key.charAt(i);

            int ascii_cipher=c1;
            int ascii_key=c2;

            while(ascii_cipher>0)
            {
                int rem=ascii_cipher%2;
                binary_cipher=rem+binary_cipher;
                ascii_cipher/=2;
            }

            while(ascii_key>0)
            {
                int rem=ascii_key%2;
                binary_key=rem+binary_key;
                ascii_key/=2;
            }

            while(binary_cipher.length()<8)
            {
                binary_cipher="0"+binary_cipher;
            }

            while(binary_key.length()<8)
            {
                binary_key="0"+binary_key;
            }

            for(int j=0;j<binary_cipher.length();j++)
            {
                char cc=binary_cipher.charAt(j);
                char ck=binary_key.charAt(j);
                int digit_cipher=cc-'0';
                int digit_key=ck-'0';

                XOR+=digit_cipher^digit_key;
            }

            int ascii=0;
            for(int j=0;j<XOR.length();j++)
            {
                char c=XOR.charAt(j);
                if(c=='1')
                {
                    ascii+=Math.pow(2,7-j);
                }
                else
                {
                    continue;
                }
            }
            plain+=(char)(ascii+32);
        }
        System.out.print("Ciphertext: "+cipher+"\n"+"Plaintext: "+plain);
    }
}
