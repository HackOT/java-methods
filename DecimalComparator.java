package method_challenge;
public class DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces(double param1 , double param2){
            
            int newParam1 = (int) (param1 * 1000);
            int newParam2 = (int) (param2 * 1000);
            if (  newParam1  == newParam2){
                return true;
            }
            return false;
        }
    }
