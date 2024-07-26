package j04011;

/**
 *
 * @author nducmd
 */
public class Point3D {

    int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Point3D calculateVector(Point3D p1, Point3D p2, Point3D p3) {
        int x1 = p2.x - p1.x;
        int y1 = p2.y - p1.y;
        int z1 = p2.z - p1.z;

        int x2 = p3.x - p1.x;
        int y2 = p3.y - p1.y;
        int z2 = p3.z - p1.z;

        int nx = y1 * z2 - z1 * y2;
        int ny = z1 * x2 - x1 * z2;
        int nz = x1 * y2 - y1 * x2;

        return new Point3D(nx, ny, nz);
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        Point3D vector1 = calculateVector(p1, p2, p3);

        int vector2 = vector1.x * (p4.x - p1.x) + vector1.y * (p4.y - p1.y) + vector1.z * (p4.z - p1.z);

        return Math.abs(vector2) == 0;
    }
}
/*
3
1 2 0
2 3 0
4 0 0
0 0 0
1 1 1
2 2 2
3 3 3
4 4 4
5 6 7
-8 -9 -10
12 19 0
3 1 5
*/