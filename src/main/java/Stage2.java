public class Stage2 {

    public String action(int i) {
        if (i%3 == 0)
            return "Fizz";
        if (i%5==0)
            return "Buzz";
        else
            return i + "";
    }
}
