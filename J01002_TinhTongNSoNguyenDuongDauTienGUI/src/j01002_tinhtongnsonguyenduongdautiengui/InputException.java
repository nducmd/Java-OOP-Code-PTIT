

package j01002_tinhtongnsonguyenduongdautiengui;

/**
 *
 * @author nducmd
 */


public class InputException extends RuntimeException {

    public InputException(String string) {
        super(string);
    }

    public InputException() {
        super("Yêu cầu nhập đủ 2 số.");
    }
    
}