package mk.ukim.finki.emt.emtlab2.model.exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(){
        super("Book not found!");
    }
}
