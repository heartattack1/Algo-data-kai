package Exception;

/**
 * 23.02.2016.
 */

public class QueueEmptyException extends RuntimeException {

    public QueueEmptyException(){
        super();
    }

    public QueueEmptyException(String message){
        super(message);
    }

}
