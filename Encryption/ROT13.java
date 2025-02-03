import java.util.*;
class ROT13
  {
    static Scanner input=new Scanner(System.in);
    public static void main(String s[])
    {
        System.out.print("plaintext: ");
        String plain=input.nextLine();
        String ciphertext="";

        for(int i=0;i<plain.length();i++)
        {
            char c1=plain.charAt(i);
            if (c1>='a'&&c1<='z') 
            {
                c1=(char)((c1-'a'+13)%26 +'a');
            }
            else if (c1>='A'&&c1<='Z') 
            {
                c1=(char)((c1-'A'+13)%26 +'A');
            }
            ciphertext+=c1;
        }
        System.out.println("Plaintext: "+plain+"\n"+"ciphertext: "+ciphertext);
        System.out.println("--------------------------");
    }
  }
