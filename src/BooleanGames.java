public class BooleanGames {
    private int number;  // instance variable

    // constructor
    public BooleanGames(int number) {
        this.number = number;
    }

    public boolean isNegative() {
        return (number < 0);
    }

    public boolean exceeds(int num){
        return (num>number);
    }
    
    public boolean isEven() {
        return (number%2 == 0);
    }

    public boolean isOdd() {
        return (number%2 == 1);
    }

    public boolean isMultipleOf(int x) {
        return (number%x == 0);
    }

    public boolean isOnesDigit(int num) {
        return (Math.abs(num%10) == number);
    }
}
