/**
 * Created by alex on 18.06.2015.
 * for education purposes only :)
 */

public class ChokolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChokolateBoiler instanceId = new ChokolateBoiler();

    private ChokolateBoiler() {
        empty = true;
        boiled = false;
    }

    private static ChokolateBoiler getInstance() {
        return instanceId;
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            this.boiled = true;
            System.out.println("boil!!! boiled = " + isBoiled());
        }
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.printf("fill!!! boiled = %b\tempty = %b\n", isBoiled(), isEmpty());
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("drain!!! empty = " + isEmpty());
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public static void main(String args[]) {
        ChokolateBoiler.getInstance().drain();
        ChokolateBoiler.getInstance().boil();
        ChokolateBoiler.getInstance().fill(); // 1
        ChokolateBoiler.getInstance().fill();
        ChokolateBoiler.getInstance().drain();
        ChokolateBoiler.getInstance().boil(); // 2
        ChokolateBoiler.getInstance().boil();
        ChokolateBoiler.getInstance().drain(); // 3
        ChokolateBoiler.getInstance().drain();
        ChokolateBoiler.getInstance().boil();
    }
}
