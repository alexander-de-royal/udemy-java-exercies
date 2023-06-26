public class Main {

//    public static void main(String[] args) {
//        System.out.println("The sum of the digits in number is 1234 is " + sumDigits(1234));
//    }
//
//    public static int sumDigits(int number) {
//
//        if(number < 0){
//            return -1;
//        }
//        int sum = 0;
//        while(number > 9){
//            sum += (number % 10);
//            number = number / 10;
//        }
//        sum += number;
//        return sum;
//    }


//    public static void main(String[] args) {
//
//        int number = 4;
//        int finishNumber = 20;
//        int evenCount = 0;
//        int oddCount = 0;
//
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                oddCount++;
//                continue;
//            }
//            System.out.println("Even Number " + number);
//            evenCount++;
//            if(evenCount >= 5){
//                break;
//            }
//        }
//        System.out.println("Total odd numbers found = " + oddCount);
//        System.out.println("Total even numbers found = " + evenCount);
//    }
//
//    public static boolean isEvenNumber(int number) {
//        if ((number % 2) == 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public static void main(String[] args) {
//        int number = 0;
//        while(number < 50){
//            number += 5;
//            if(number % 25 == 0){
//                continue;
//            }
//            System.out.println(number + "_");
//        }
//    }
//    public static void main(String[] args) {
//
//        for(int i = 1; i <=5; i++){
//            System.out.println(i);
//        }
//        int j = 1;
//        boolean isReady = false;
//        do{
//            if(j > 5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//        } while (isReady);
//    }
//    public static void main(String[] args) {
//        int countOfMatches = 0;
//        int sumOfMatches = 0;
//
//        for(int i = 0; i <= 1000; i++){
//            if( (i % 3 == 0) && (i % 5 == 0)){
//                countOfMatches++;
//                sumOfMatches += i;
//                System.out.println("Found a match = " + i);
//            }
//            if(countOfMatches == 5){
//                break;
//            }
//        }
//        System.out.println("Sum = " + sumOfMatches);
//    }
//    public static void main(String[] args) {
//        int count = 0;
//        for(int i = 10; i <= 50; i++){
//            if(isPrime(i)){
//                System.out.println("number " + i + " is a prime number");
//                count++;
//                if(count == 3){
//                    System.out.println("Found 3 = Exiting for loop");
//                    break;
//
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//
//            System.out.println("i = " + i);
//        }
//    }
}