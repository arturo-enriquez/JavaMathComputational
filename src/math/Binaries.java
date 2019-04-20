package math;

import java.util.ArrayList;

public class Binaries {
    
    
    public String decToBinary(int numero){    
        return Integer.toBinaryString(numero)+""; 
    }    
    
    public int binaryToDec(String binary){
        return Integer.parseInt(binary,2);
    }
    
    public String sumBinary(String binary1, String binary2){
        int sum  = (Integer.parseInt(binary1,2)) + (Integer.parseInt(binary2,2));
        return Integer.toBinaryString(sum)+"";
    }
    
    public String subtractBinary(String binary1, String binary2){
        int subtract  = (Integer.parseInt(binary1,2)) - (Integer.parseInt(binary2,2));
        return Integer.toBinaryString(subtract)+"";
    }
    
    public boolean isBinary(String binary){
        try {
            Integer.parseInt(binary,2);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
    
}
