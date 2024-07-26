

package j04005;

/**
 *
 * @author nducmd
 */

public class Student {
    private String name;
    private String dob;
    private float s1, s2, s3, sum;
    public Student(String name, String dob, float s1, float s2, float s3) {
        this.name = name;
        this.dob = dob;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.sum = s1 + s2 + s3;
    }
    public void print() {
        System.out.printf("%s %s %.1f", name, dob, sum);
    }
}
