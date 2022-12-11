package Day11;

import java.util.ArrayList;

public class Monkey {
    // Fields
    private ArrayList<Integer> startingItems;
    private int divBy;
    private int throwTrue;
    private int throwFalse;
    private boolean multiplyOld;
    private int multiplyBy;
    private int addBy;
    private int inspected;

    public Monkey(ArrayList<Integer> startingItems, int divBy, int throwTrue, int throwFalse, boolean multiplyOld, int multiplyBy, int addBy) {
        this.startingItems = startingItems;
        this.divBy = divBy;
        this.throwTrue = throwTrue;
        this.throwFalse = throwFalse;
        this.multiplyOld = multiplyOld;
        this.multiplyBy = multiplyBy;
        this.addBy = addBy;
        inspected = 0;
    }

    public ArrayList<Integer> getStartingItems() {
        return startingItems;
    }

    public int getDivBy() {
        return divBy;
    }

    public int getThrowTrue() {
        return throwTrue;
    }

    public int getThrowFalse() {
        return throwFalse;
    }

    public boolean isMultiplyOld() {
        return multiplyOld;
    }

    public int getMultiplyBy() {
        return multiplyBy;
    }

    public int getAddBy() {
        return addBy;
    }

    public int getInspected() {
        return inspected;
    }

    public void incrementInspected() {
        this.inspected++;
    }

    public void addStartingItem(int item) {
        startingItems.add(item);
    }
    public void clearStartingItems() {
        startingItems.clear();
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "startingItems=" + startingItems +
                ", divBy=" + divBy +
                ", throwTrue=" + throwTrue +
                ", throwFalse=" + throwFalse +
                ", multiplyOld=" + multiplyOld +
                ", multiplyBy=" + multiplyBy +
                ", addBy=" + addBy +
                '}';
    }
// Constructors

    // Methods

}
