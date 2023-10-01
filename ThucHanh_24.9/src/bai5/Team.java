package bai5;

public class Team {
    public String teamID, teamName, schoolName;
    public static int cnt = 1;

    public Team(String teamName, String schoolName) {
        this.teamID = "Team" + String.format("%02d", cnt++);
        this.teamName = teamName;
        this.schoolName = schoolName;
    }
}
