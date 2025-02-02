import java.util.*;
class MorseCode_Decode
{
    static void display(String plain)
    {
        System.out.println("Plaintext: "+plain);
    }
    public static void main(String s[])
    {
        String cipher="";
        String plain="";
        Scanner input=new Scanner(System.in);
        System.out.print("NOTE: TYPE LETTER BY LETTER (ONE_BY_ONE) & FOR EXIT PRESS 'X'.\nCiphertext: ");

        while(true)
        {
            System.out.print("\n-->");
            cipher=input.next();
            
                switch(cipher)
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
                case "X": 
                display(plain); 
                return;
                case "x": 
                display(plain); 
                return;
                default: 
                System.out.print("Invalid"); 
                break;    
            }
        }
    }
}
