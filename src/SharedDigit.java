public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo){
        if ((numberOne < 10 || numberOne >99) || (numberTwo < 10 || numberTwo > 99)){
            return false;
        }
        while (numberOne > 0){
            int tempTwo = numberTwo;
            int digitOne = numberOne % 10;
            while (tempTwo > 0){
                int digitTwo = tempTwo % 10;
                if (digitOne == digitTwo){
                    return true;
                }
                tempTwo /= 10;
            }
            numberOne /= 10;
        }
        return false;
    }
}
