package j07059;

import java.time.*;

public class CaThi {
    private String id, date, time, room;

    public CaThi(int id, String date, String time, String room) {
        this.id = "C" + String.format("%03d", id);
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public String getId() {
        return id;
    }
    
    public LocalDate getDate() {
        String[] arr = this.date.split("/");
        LocalDate date = LocalDate.of(Integer.valueOf(arr[2]), Integer.valueOf(arr[1]), Integer.valueOf(arr[0]));
        return date;
    }
    
    public LocalTime getTime() {
        String[] arr = this.time.split(":");
        LocalTime time = LocalTime.of(Integer.valueOf(arr[0]), Integer.valueOf(arr[1]));
        return time;
    }
    
    public String toString() {
        return this.id + " " + this.date + " " + this.time + " " + this.room;
    }
}
