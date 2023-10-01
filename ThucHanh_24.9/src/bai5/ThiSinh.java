package bai5;

public class ThiSinh {
    public String id, name, teamID;
    public Team doi;
    public static int cnt = 1;

    public ThiSinh(String name, String teamID) {
        this.id = "C" + String.format("%03d", cnt++);
        this.name = name;
        this.teamID = teamID;
    }
    
    public String toString() {
        return this.id + " " + this.name + " " + doi.teamName + " " + doi.schoolName; 
    }    
}
