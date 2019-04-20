package math;

public class Numericals {

    public String decToHex(int decimal){    
        int rem;  
        String hex="";   
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        while(decimal>0){  
           rem=decimal%16;   
           hex=hexchars[rem]+hex;   
           decimal=decimal/16;  
        }  
        return hex;  
    }     
    
    public String hexToDec(String hex){ 
        if (!isHexNumber(hex)) return "No es Hexadecimal";
        
        String digits = "0123456789ABCDEF";  
        hex = hex.toUpperCase();  
        int val = 0;  
        for (int i = 0; i < hex.length(); i++) {  
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;  
        }  
        return val+"";  
    }  
    
    
    public boolean isHexNumber (String cadena) {
        try {
            Long.parseLong(cadena, 16);
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }
    
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
    
    
    public String decToOctal(int decimal){    
        int rem; 
        String octal=""; 
        char octalchars[]={'0','1','2','3','4','5','6','7'};
        while(decimal>0){  
           rem=decimal%8;   
           octal=octalchars[rem]+octal;   
           decimal=decimal/8;  
        }  
        return octal;  
   }    
    
    public int octalToDec(int octal){    
        int decimal = 0;    
        int n = 0;     
        while(true){    
            if(octal == 0){    
                break;    
            } else {    
                int temp = octal%10;    
                decimal += temp*Math.pow(8, n);    
                octal = octal/10;    
                n++;    
           }    
        }    
        return decimal;    
    }    

}
  