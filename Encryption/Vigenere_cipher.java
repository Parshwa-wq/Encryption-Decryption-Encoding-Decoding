import java.util.*;
class Vigenere_cipher
{
    static Scanner input=new Scanner(System.in);
    public static void main(String s[])
    {
        String key;
        String plaintext;
        int count=0;
        String ciphertext="";
        System.out.print("\nPlaintext: ");
        plaintext=input.nextLine();

        System.out.print("key(a-z): ");
        key=input.next();
        input.nextLine();

        for(int i=0;i<key.length();i++)
        {
            char c=key.charAt(i);
            if(c>='0' && c<='9')
            {
                System.out.print("Integers are not accepted in key.\nTry again:");
                key=input.next();
                input.nextLine();
            }

        }

        if(plaintext.length()>key.length())
        {   
            while(key.length()<plaintext.length())
            {
                char c=key.charAt(count);
                count++;
                if(count==key.length()-1)
                {
                    count=0;
                }
                key+=c;
            }
        }

        for(int i=0;i<plaintext.length();i++)
        {
            char c1=plaintext.charAt(i);
            char c2=key.charAt(i);
            if (c1 >= 'a' && c1 <= 'z')
            {
                c1 = (char)('a'+(c1-'a'+(c2-(c2>='A' && c2<='Z' ? 'A':'a')))%26);
            } 
            else if (c1 >= 'A' && c1 <= 'Z') 
            {
                c1 = (char)('A'+(c1-'A'+(c2-(c2>='A' && c2<='Z' ? 'A':'a')))%26);
            }
            ciphertext+=c1;
        }
        System.out.println("\nPlaintext: "+plaintext+"\n"+"ciphertext: "+ciphertext);
        System.out.println("--------------------------");
    }
}
