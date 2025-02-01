import java.util.*;
class URL_decoding
{
    static String cipher="";
    static String plain="";
    public static void main(String s[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("ciphertext: ");
        cipher=input.nextLine();

        for(int i=0;i<cipher.length();i++)
        {
            char c1=cipher.charAt(i);
            if(c1=='+')
            {
                plain+=" ";
                break;
            }

            if(c1=='%' && i+2<=cipher.length()-1)
            {
                char c2=cipher.charAt(i+1);
                char c3=cipher.charAt(i+2);
                i+=2;

                if(c1=='%' && c2=='2' && c3=='0')
                {
                    plain+=" ";
                }
                else if(c1=='%' && c2=='2' && c3=='1')
                {
                    plain+="!";
                }
                else if(c1=='%' && c2=='2' && c3=='3')
                {
                    plain+="#";
                }
                else if(c1=='%' && c2=='2' && c3=='4')
                {
                    plain+="$";
                }
                else if(c1=='%' && c2=='2' && c3=='6')
                {
                    plain+="&";
                }
                else if(c1=='%' && c2=='3' && c3=='D')
                {
                    plain+="=";
                }
            }
            else
            plain+=c1;
            
        }
        System.out.print("Ciphertext: "+cipher+"Plaintext: "+plain);
        
    }
}
