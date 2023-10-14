package j08011;

public class Pair<F, S> implements Comparable<Pair> {
    private String f;
    private int s;

    public Pair(String f, int s) {
        this.f = f;
        this.s = s;
    }
    
    public String toString() {
        return this.f + " " + this.s;
    }

    @Override
    public int compareTo(Pair o) {
       return o.s - this.s;
    }
}
