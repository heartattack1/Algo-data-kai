package Exception;

/**
 * 23.02.2016.
 */
public class QueueFullException extends RuntimeException {

    public QueueFullException(){
        super();
    }

    public QueueFullException(String message){
        super(message);
    }

}