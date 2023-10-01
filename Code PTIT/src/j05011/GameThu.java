package j05011;

public class GameThu {
    private String id, name, gioVao, gioRa;

    public GameThu(String id, String name, String gioVao, String gioRa) {
        this.id = id;
        this.name = name;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
    
    public int getGioChoi() {
        String[] st = this.gioVao.split(":");
        String[] en = this.gioRa.split(":");
        int vao = Integer.parseInt(st[0]) * 60 + Integer.parseInt(st[1]);
        int ra = Integer.parseInt(en[0]) * 60 + Integer.parseInt(en[1]);
        int delta = ra - vao;
        return delta / 60;
    }
    
    public int getPhutChoi() {
        String[] st = this.gioVao.split(":");
        String[] en = this.gioRa.split(":");
        int vao = Integer.parseInt(st[0]) * 60 + Integer.parseInt(st[1]);
        int ra = Integer.parseInt(en[0]) * 60 + Integer.parseInt(en[1]);
        int delta = ra - vao;
        return delta % 60;
    }
    
    public String getThoiGianChoi() {
        return this.getGioChoi() + " gio " + this.getPhutChoi() + " phut";
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.getThoiGianChoi();
    }
}
