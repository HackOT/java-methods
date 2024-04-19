package method_challenge;
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking , int hourOfDay){
        
        if (0 > hourOfDay || hourOfDay>23){
            
            return false;
        }
        
        else if (barking == false){
            
            return false;
        }
        else{
            if (8 <= hourOfDay && hourOfDay< 23){
            
                return false;
            }
            else{
                return true;
            }
        }
                
            
    }
    
}