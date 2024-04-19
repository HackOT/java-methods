package method_challenge;
public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes( int kiloBytes){
                if (kiloBytes < 0){
                    
                    System.out.println("Invalid Value");
                }
                else{
                    
                    int megabytes = (int) (kiloBytes/1024);
                    int remaining = (int) (kiloBytes%1024);
                
                    System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remaining + " KB");
                } 
            }
        }
