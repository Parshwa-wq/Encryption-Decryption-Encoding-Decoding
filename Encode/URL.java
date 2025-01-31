import java.util.*;
class URL_encoding
{
    static String plain="";
    static String cipher="";
    public static void main(String s[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("plaintext: ");
        plain=input.nextLine();

        for(int i=0;i<plain.length();i++)
        {
            char c=plain.charAt(i);
            switch(c)
            {
                case ' ':
                cipher+="%20";
                break;
                case '!':
                cipher+="%21";
                break;
                case '#':
                cipher+="%23";
                break;
                case '$':
                cipher+="%24";
                break;
                case '&':
                cipher+="%26";
                break;
                case '=':
                cipher+="%3D";
                break;
                default:
                cipher+=c;
            }
        }
        System.out.print("Plaintext: "+plain+"ciphertext: "+cipher);   
    }
}
