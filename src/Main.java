import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parcheggio p = new Parcheggio(4);
        List<Automobile> automobili = new ArrayList<Automobile>();
        for (int i = 0; i < 8; i++) {
            automobili.add(new Automobile("Automobile " + (i+1) + "", p));
        }
        automobili.forEach(e -> e.start());
    }
}
