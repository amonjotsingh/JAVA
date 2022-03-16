public class Bytwo implements Multiply{

    int var;
    {
        var = 1;
    }
    @Override
    public int multiply() {
        var = 2*var;
        return var;
    }
}
