package method_challenge;
public class SecMinConverter {
    public static void main(String[] args) {
        
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(85, -2));
    }
    public static String getDurationString (int second){

        if (second >= 0 ){
            int hours = second / 3600;
            return second + " second equals to " + hours + "hour";
        }
        else{
        }
        return "Invalid Value ";

    }   

    public static String getDurationString (int minutes, int second){

        if (minutes >= 0 && second >= 0){
            int remain_second = second % 3600;
            int remain_minutes = minutes % 60;

            int hours = (minutes/60) + (second/3600);
            int new_minutes = remain_minutes + (remain_second / 60);
            int new_seconds = remain_second % 60;
        return hours + " hours " + new_minutes + " minutes " + new_seconds + " seconds ";
        }
        else {
            return "Invalid Value";
        }
    }
}