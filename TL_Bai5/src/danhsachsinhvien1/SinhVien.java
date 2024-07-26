

package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nducmd
 */

public class SinhVien implements Serializable{
    
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String date, float gpa) throws ParseException {
        this.ma = String.format("B20DCCN%03d", 1);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(ma);
        sb.append(" ").append(ten);
        sb.append(" ").append(lop);
        sb.append(" ").append(new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh));
        sb.append(" ").append(String.format("%.2f",gpa));
        return sb.toString();
    }
    
    
}
