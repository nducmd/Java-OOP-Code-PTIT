

package j04012;

/**
 *
 * @author nducmd
 */

public class Employee {
    private String id, name, role;
    private int soNgayCong, luongCoBan;
    private int thuNhap, luongThang, thuong = 0, phuCap;
    public Employee(String name, int luongCoBan, int soNgayCong, String role) {
        this.id = "NV01";
        this.name = name;
        this.soNgayCong = soNgayCong;
        this.role = role;
        this.luongThang = luongCoBan * soNgayCong;
        if (soNgayCong >= 25) {
            this.thuong = this.luongThang / 5;
        } else if (soNgayCong >= 22) {
            this.thuong = this.luongThang / 10;
        }
        switch (role) {
            case "GD":
                this.phuCap = 250000;
                break;
            case "PGD":
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            case "NV":
                this.phuCap = 150000;
                break;
            default:
                break;
        }
        
        this.thuNhap = this.luongThang + this.thuong + this.phuCap;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
    }
}
