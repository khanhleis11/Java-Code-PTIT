package j07060;

public class CaThi {
    private String idCT, date, time, room;

    public CaThi(int idCT, String date, String time, String room) {
        this.idCT = "C" + String.format("%03d", idCT);
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public String getIdCT() {
        return idCT;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return room;
    }
}
