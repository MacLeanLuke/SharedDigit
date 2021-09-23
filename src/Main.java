public class Main {
    public static void main(String[] args) {
        System.out.println("Number 12 and 23 share at least one digit in common: " + SharedDigit.hasSharedDigit(12,23));
        System.out.println("Number 9 and 99 share at least one digit in common: " + SharedDigit.hasSharedDigit(9,99));
        System.out.println("Number 15 and 55 share at least one digit in common: " + SharedDigit.hasSharedDigit(15,55));
        System.out.println("Number 12 and 13 share at least one digit in common: " + SharedDigit.hasSharedDigit(12,13));
        System.out.println("Number 45 and 56 share at least one digit in common: " + SharedDigit.hasSharedDigit(45,56));
        System.out.println("Number 23 and 22 share at least one digit in common: " + SharedDigit.hasSharedDigit(23,22));

    }
}
