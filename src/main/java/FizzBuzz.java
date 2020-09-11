public class FizzBuzz {
    public String action(int input) {
        if (input % 3 == 0){
            return "Fizz";
        }
        if (input % 5 == 0){
            return "Buzz";
        }
        else
           return input + "";
    }
}
