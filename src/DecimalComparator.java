public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

        int number1 = (int)(x*1000);
        int number2 = (int)(y*1000);

        if(number1 == number2){
            return true;
        }
        return false;
    }
}
