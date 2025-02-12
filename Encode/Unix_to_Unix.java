import java.util.*;
class UUEncoding
{
    static void block(String []arr,String plain)
    {
        int padding=plain.length();
        String cipher="";
        
        for(int i=0;i<arr.length;i++)
        {
            int ascii=0;
            int j=0;
            while(j<6)
            {
                char c=arr[i].charAt(j);
                if(c=='1')
                {
                    ascii+=(int)Math.pow(2,5-j);
                    j++;
                }
                else
                {
                    j++;
                    continue;
                }
            }
            
            cipher+=(char)(ascii+32); 
        }
        while(padding%3!=0)
        {
            cipher+="`";
            padding++;
        }

        int totalBytes=plain.length()+32;
        cipher=(char)totalBytes+cipher;
        System.out.print("Ciphertext: "+cipher);
    }
    public static void main(String s[]) 
    {
        base64_encode obj=new base64_encode();
        Scanner input=new Scanner(System.in);
        System.out.print("Plaintext: ");
        String plain=input.nextLine();
        String combined_binary="";
        int count=0;
        int j=0;

        for(int i=0;i<plain.length();i++)
        {
            String binary="";
            int c=(int)plain.charAt(i);
            binary+="";
            while(c>0)
            {
            int rem=c%2;
            binary=rem+binary;
            c/=2;

            }
            while (binary.length() < 8) 
            {
                binary="0"+binary; 
            }
            //System.out.print(binary+" ");
            combined_binary+=binary;
        }

        

        if(combined_binary.length()%6!=0)
        {
            while(combined_binary.length()%6!=0)
            {
                combined_binary+="0";
            }
        }
        
        String arr[]=new String[combined_binary.length()/6];

        for(;count<combined_binary.length();)
        {
            String blockString="";
            int i=0;
            
            while(i<6)
            {
                char c=combined_binary.charAt(count);
                blockString+=c;
                count++;
                i++;
            }
            arr[j]=blockString;
            j++;
        }
        block(arr,plain);
    }
}
