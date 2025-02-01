import java.util.*;
class MorseCode_encode
{
    public static void main(String s[])
    {
        String plain="";
        String cipher="";
        Scanner input=new Scanner(System.in);
        System.out.print("Plaintext: ");
        plain=input.nextLine().toUpperCase();

        for(int i=0;i<plain.length();i++)
        {
            char c=plain.charAt(i);
            switch(c)
            {
                case 'A':
                cipher+=".- ";
                break;
                case 'B':
                cipher+="-... ";
                break;
                case 'C':
                cipher+="-.-. ";
                break;
                case 'D':
                cipher+="-.. ";
                break;
                case 'E':
                cipher+=". ";
                break;
                case 'F':
                cipher+="..-. ";
                break;
                case 'G':
                cipher+="..-. ";
                break;
                case 'H':
                cipher+=".... ";
                break;
                case 'I':
                cipher+=".. ";
                break;
                case 'J':
                cipher+=".--- ";
                break;
                case 'K':
                cipher+="-.- ";
                break;
                case 'L':
                cipher+=".-.. ";
                break;
                case 'M':
                cipher+="-- ";
                break;
                case 'N':
                cipher+="-. ";
                break;
                case 'O':
                cipher+="--- ";
                break;
                case 'P':
                cipher+=".--. ";
                break;
                case 'Q':
                cipher+="--.- ";
                break;
                case 'R':
                cipher+=".-. ";
                break;
                case 'S':
                cipher+="... ";
                break;
                case 'T':
                cipher+="- ";
                break;
                case 'U':
                cipher+="..- ";
                break;
                case 'V':
                cipher+="...- ";
                break;
                case 'W':
                cipher+=".-- ";
                break;
                case 'X':
                cipher+="-..- ";
                break;
                case 'Y':
                cipher+="-.-- ";
                break;
                case 'Z':
                cipher+="--.. ";
                break;
                case '0': 
                cipher+="----- "; 
                break;
                case '1': 
                cipher+=".---- "; 
                break;
                case '2': 
                cipher+="..--- "; 
                break;
                case '3': 
                cipher+="...-- "; 
                break;
                case '4': 
                cipher+="....- "; 
                break;
                case '5': 
                cipher+="..... "; 
                break;
                case '6': 
                cipher+="-.... "; 
                break;
                case '7': 
                cipher+="--... "; 
                break;
                case '8': 
                cipher+="---.. "; 
                break;
                case '9': 
                cipher+="----. "; 
                break;
                case '.': 
                cipher+=".-.-.- "; 
                break;
                case ',': 
                cipher+="--..-- "; 
                break;
                case '?': 
                cipher+="..--.. "; 
                break;
                case '\'': 
                cipher+=".----. "; 
                break;
                case '!': 
                cipher+="-.-.-- "; 
                break;
                case '/': 
                cipher+="-..-. "; 
                break;
                case '(': 
                cipher+="-.--. "; 
                break;
                case ')': 
                cipher+="-.--.- "; 
                break;
                case '&': 
                cipher+=".-... "; 
                break;
                case ':': 
                cipher+="---... "; 
                break;
                case ';': 
                cipher+="-.-.-. "; 
                break;
                case '=': 
                cipher+="-...- "; 
                break;
                case '+': 
                cipher+=".-.-. "; 
                break;
                case '-': 
                cipher+="-....- "; 
                break;
                case '_': 
                cipher+="..--.- "; 
                break;
                case '"': 
                cipher+=".-..-. "; 
                break;
                case '$': 
                cipher+="...-..- "; 
                break;
                case '@': 
                cipher+=".--.-. "; 
                break;
                case ' ':
                cipher+="";
                break;
                default:
                cipher+="";
                break;
            }
        }
        System.out.print("Ciphertext: "+cipher);
    }
}
