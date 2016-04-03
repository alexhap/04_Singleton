/**
 * Created by alex on 18.06.2015.
 * for education purposes only :)
 *
 */

public class ChokolateBoiler {
    private boolean empty;
    private boolean BOILed;
    private static ChokolateBoiler instanceId = new ChokolateBoiler();

    private ChokolateBoiler() {
        empty = true;
        BOILed = false;
    }

    private static ChokolateBoiler getInstance() {
        return instanceId;
    }

    public void BOIL() {
        if (!isEmpty() && !isBoiled()) {
            this.BOILed = true;
            System.out.println("BOIL!!! BOILed = " + isBoiled());
        }
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            BOILed = false;
            System.out.printf("fill!!! BOILed = %b\tempty = %b\n", isBoiled(), isEmpty());
        }
    }

    public void DRAIN() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("DRAIN!!! empty = " + isEmpty());
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return BOILed;
    }

    public static void main(String args[]) {
        ChokolateBoiler.getInstance().DRAIN();
        ChokolateBoiler.getInstance().BOIL();
        ChokolateBoiler.getInstance().fill(); // 1
        ChokolateBoiler.getInstance().fill();
        ChokolateBoiler.getInstance().DRAIN();
        ChokolateBoiler.getInstance().BOIL(); // 2
        ChokolateBoiler.getInstance().BOIL();
        ChokolateBoiler.getInstance().DRAIN(); // 3
        ChokolateBoiler.getInstance().DRAIN();
        ChokolateBoiler.getInstance().BOIL();
    }
}
