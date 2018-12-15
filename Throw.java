import java.lang.NullPointerException;

public class Throw{

    static void demoproc() {
        throw new NullPointerException("demo");
    }

    // 100 more methods here
    public static void main(String args[]) {
        demoproc();
        try {
            
        } catch(NullPointerException e) {

            System.out.println("Afzal + ...............");
        }
    }
}