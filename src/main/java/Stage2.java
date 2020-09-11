public class Stage2 {

    public String action(int i) {
        if (i == 2)
            return "2";
        if (i==3)
            return "Fizz";
        if (i==5)
            return "Buzz";
        else
            return i + "";
    }
}
