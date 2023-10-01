package j04011;

public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
        
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d) {
        Point3D AB = new Point3D(b.x - a.x, b.y - a.y, b.z - a.z);
        Point3D AC = new Point3D(c.x - a.x, c.y - a.y, c.z - a.z);
        Point3D AD = new Point3D(d.x - a.x, d.y - a.y, d.z - a.z);
        Point3D tmp = new Point3D(AB.y * AC.z - AB.z * AC.y, AB.z * AC.x - AB.x * AC.z, AB.x * AC.y - AB.y * AC.x);
        int res = tmp.x * AD.x + tmp.y * AD.y + tmp.z * AD.z;
        return res == 0;
    }
}
