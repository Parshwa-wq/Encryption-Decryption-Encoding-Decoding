import java.util.*;
class Ceaser_cipher
{
    static Scanner input=new Scanner(System.in);
    public static void main(String s[])
    {
        String ciphertext="";
        System.out.print("\nPlaintext: ");
        String plaintext=input.nextLine();

        System.out.print("Key: ");
        int key=input.nextInt();

        input.nextLine();

        for(int i=0;i<plaintext.length();i++)
        {
            char c1=plaintext.charAt(i);
            if (c1>='a'&&c1<='z') 
            {
                c1=(char)((c1-'a'+key)%26 +'a');
            }
            else if (c1>='A'&&c1<='Z') 
            {
                c1=(char)((c1-'A'+key)%26 +'A');
            }
            ciphertext+=c1;
        }
        System.out.println("\nPlaintext: "+plaintext+"\n"+"Ciphertext: "+ciphertext);
        System.out.println("--------------------------");
    }
}
