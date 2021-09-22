public class LeapYear {
    // write a method isLeapYear with a parameter of type int named year
    public static boolean isLeapYear(int year){
        // the parameter needs to be greater than or equal to one and less than or equal to 9999
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
