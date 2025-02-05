import java.util.*;
class Vigenere_cipher
  {
    static Scanner input=new Scanner(System.in);
    public static void main(String s[])
    {
            String key;
            String ciphertext;
            int count=0;
            String plaintext=""; 
            System.out.print("\nCiphertext: ");
            ciphertext=input.nextLine();
    
            System.out.print("Key that you used before to encrypt your plaintext:(a-z): ");
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
    
            if(ciphertext.length()>key.length())
            {
                while(key.length()<ciphertext.length())
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
    
            System.out.print(key);
            for(int i=0;i<ciphertext.length();i++)
            {
                char c1=ciphertext.charAt(i);
                char c2=key.charAt(i);
                
                if (c1 >= 'a' && c1 <= 'z')
                {
                    c1 = (char)(c1-((c2-(c2>='A' && c2<='Z' ? 'A':'a')+26))%26);
                    if(c1<'a')
                    {
                        c1=(char)(c1+('z'-'a')+1);
                    }
                } 
                else if (c1 >= 'A' && c1 <= 'Z') 
                {
                    c1 = (char)(c1-((c2-(c2>='A' && c2<='Z' ? 'A':'a'))+26)%26);
                    if(c1<'A')
                    {
                        c1=(char)(c1+('Z'-'A')+1);
                    }
                }
                plaintext+=c1;
            }
            System.out.println("\nCiphertext: "+ciphertext+"\n"+"Plaintext: "+plaintext);
            System.out.println("--------------------------");
    }
  }
