package bai4;

public class Team implements Comparable<Team>{
    private String name, uni = "";

    public Team(String name) {
        this.name = name;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getUni() {
        return uni;
    }
    
    public String toString() {
        return this.name + " ";
    }

    @Override
    public int compareTo(Team o) {
        if (this.uni.equals(o.uni)) {
            return this.name.compareTo(o.name);
        }
        return this.uni.compareTo(o.uni);
    }
}
