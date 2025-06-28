package badminton;

public class Batch {
    String slot;
    int spots;

    public Batch(String slot, int spots) {
        this.slot = slot;
        this.spots = spots;
    }

    public void display() {
        System.out.println(slot + " (" + spots + " spots left)");
    }
}
