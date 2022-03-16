import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Multiply bytwo = new Bytwo();
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(bytwo.multiply());
        }
        bytwo = new Bythree();
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(bytwo.multiply());
        }
    }

}
