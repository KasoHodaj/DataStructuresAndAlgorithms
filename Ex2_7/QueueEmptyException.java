package Ex2_7;

public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException(String err) {

        super(err);
    }
}