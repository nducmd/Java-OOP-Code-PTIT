package j05033;

/**
 *
 * @author nducmd
 */
public class Time implements Comparable<Time> {

    private int h, m, s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }

    @Override
    public int compareTo(Time t) {
        if (this.h == t.h) {
            if (this.m == t.m) {
                return this.s - t.s;
            }
            return this.m - t.m;
        }
        return this.h - t.h;
    }
}
