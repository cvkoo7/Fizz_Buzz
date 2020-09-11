public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1; i<=100;i++){
            System.out.println(action(i));
        }
    }
    public static String action(int input) {
        if (input % 3 == 0 && input % 5 == 0){
            return "FizzBuzz";
        }
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
