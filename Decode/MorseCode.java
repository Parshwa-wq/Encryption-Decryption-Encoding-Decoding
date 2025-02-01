import java.util.*;
class MorseCode_Decode
{
    static String plain="";
    static String cipher="";

    static void decode(String ...arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            String block=arr[i];
            switch(block)
            {
                case ".-": 
                plain += "A"; 
                break;
                case "-...": 
                plain += "B"; 
                break;
                case "-.-.": 
                plain += "C"; 
                break;
                case "-..": 
                plain += "D"; 
                break;
                case ".": 
                plain += "E"; 
                break;
                case "..-.": 
                plain += "F"; 
                break;
                case "--.": 
                plain += "G"; 
                break;
                case "....": 
                plain += "H"; 
                break;
                case "..": 
                plain += "I"; 
                break;
                case ".---": 
                plain += "J"; 
                break;
                case "-.-": 
                plain += "K"; 
                break;
                case ".-..": 
                plain += "L"; 
                break;
                case "--": 
                plain += "M"; 
                break;
                case "-.": 
                plain += "N"; 
                break;
                case "---": 
                plain += "O"; 
                break;
                case ".--.": 
                plain += "P"; 
                break;
                case "--.-": 
                plain += "Q"; 
                break;
                case ".-.": 
                plain += "R"; 
                break;
                case "...": 
                plain += "S"; 
                break;
                case "-": 
                plain += "T"; 
                break;
                case "..-": 
                plain += "U"; 
                break;
                case "...-": 
                plain += "V"; 
                break;
                case ".--": 
                plain += "W"; 
                break;
                case "-..-": 
                plain += "X"; 
                break;
                case "-.--": 
                plain += "Y"; 
                break;
                case "--..": 
                plain += "Z"; 
                break;
                case "-----": 
                plain += "0"; 
                break;
                case ".----": 
                plain += "1"; 
                break;
                case "..---": 
                plain += "2"; 
                break;
                case "...--": 
                plain += "3"; 
                break;
                case "....-": 
                plain += "4"; 
                break;
                case ".....": 
                plain += "5"; 
                break;
                case "-....": 
                plain += "6"; 
                break;
                case "--...": 
                plain += "7"; 
                break;
                case "---..": 
                plain += "8"; 
                break;
                case "----.": 
                plain += "9"; 
                break;
                case ".-.-.-": 
                plain += "."; 
                break;
                case "--..--": 
                plain += ","; 
                break;
                case "..--..": 
                plain += "?"; 
                break;
                case ".----.": 
                plain += "'"; 
                break;
                case "-.-.--": 
                plain += "!"; 
                break;
                case "-..-.": 
                plain += "/"; 
                break;
                case "-.--.": 
                plain += "("; 
                break;
                case "-.--.-": 
                plain += ")"; 
                break;
                case ".-...": 
                plain += "&"; 
                break;
                case "---...": 
                plain += ":"; 
                break;
                case "-.-.-.": 
                plain += ";"; 
                break;
                case "-...-": 
                plain += "="; 
                break;
                case ".-.-.": 
                plain += "+"; 
                break;
                case "-....-": 
                plain += "-"; 
                break;
                case "..--.-": 
                plain += "_"; 
                break;
                case ".-..-.": 
                plain += "\""; 
                break;
                case "...-..-": 
                plain += "$"; 
                break;
                case ".--.-.": 
                plain += "@"; 
                break;
                case "/": 
                plain += " "; 
                break; 
                case "": 
                plain += ""; 
                break; 
                default: 
                plain+="";
                break;    
            }
        }
        System.out.println("plaintext: "+plain);
    }

    public static void main(String s[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Ciphertext: ");
        cipher=input.nextLine();

        decode(cipher.split(" "));
    }
}
