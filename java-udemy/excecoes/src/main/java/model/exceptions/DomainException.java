package excecoes.src.main.java.model.exceptions;

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
