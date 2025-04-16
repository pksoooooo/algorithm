import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException{ 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        


        while(true) {

            int uppperCount = 0;
            int lowerCount = 0;
            int numberCount = 0;
            int spaceCount = 0;

            String str = br.readLine();

            if(str == null){
                return;
            }

            for(int i = 0; i < str.length(); i++){
                if(Character.isUpperCase(str.charAt(i))){
                    uppperCount++;
                }else if(Character.isLowerCase(str.charAt(i))){
                    lowerCount++;
                }else if(Character.isDigit(str.charAt(i))){
                    numberCount++;
                }else if(Character.isWhitespace(str.charAt(i))){
                    spaceCount++;
                }
                

            }

            
            
            System.out.println(lowerCount + " " + uppperCount + " " + numberCount + " " + spaceCount);

        }
        
            
        

    }

}