public class FizzBuzz {
    public String action(int input) {
        if (input == 3){
            return "Fizz";
        }
        if (input == 5){
            return "Buzz";
        }
        else
           return input + "";
    }
}
