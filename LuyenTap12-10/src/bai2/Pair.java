package lopPair;

public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    
    public String toString() {
        return "(" + this.first + "," + this.second + ")";
    }
}
