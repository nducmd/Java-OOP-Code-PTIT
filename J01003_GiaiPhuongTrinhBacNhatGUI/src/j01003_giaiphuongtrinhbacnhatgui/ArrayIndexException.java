

package j01003_giaiphuongtrinhbacnhatgui;

/**
 *
 * @author nducmd
 */

public class ArrayIndexException extends RuntimeException {

    public ArrayIndexException(String string) {
        super(string);
    }

    public ArrayIndexException() {
        super("Yêu cầu nhập đủ 2 số.");
    }
    
}
