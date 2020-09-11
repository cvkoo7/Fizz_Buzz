public class Stage2 {

    public String action(int i) {
        if (i%3 == 0 || Integer.toString(i).contains("3"))
            return "Fizz";
        if (i%5==0)
            return "Buzz";
        else
            return i + "";
    }
}
