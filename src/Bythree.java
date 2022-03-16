public class Bythree implements Multiply {
    int var;
    {
        var = 1;
    }

    @Override
    public int multiply() {
        var *= 3;
        return var;
    }
}
