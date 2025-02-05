import java.util.*;
class ROT13
  {
    static Scanner input=new Scanner(System.in);
    public static void main(String s[])
    {
        String plaintext="";
        System.out.print("\nciphertext: ");
        String ciphertext=input.nextLine();

        for(int i=0;i<ciphertext.length();i++)
        {
            char c1=ciphertext.charAt(i);
            if (c1 >='a'&&c1<='z') 
            {
                c1 = (char)((((c1-'a'-13)+26)%26)+'a');
            } 
            else if (c1 >= 'A' && c1 <= 'Z') 
            {
                c1 = (char)((((c1 -'A'-13)+26)%26)+'A');

            }
            plaintext+=c1;
        }
        System.out.println("\nCiphertext: "+ciphertext+"\n"+"Plaintext: "+plaintext);
        System.out.println("--------------------------");
    }
  }
