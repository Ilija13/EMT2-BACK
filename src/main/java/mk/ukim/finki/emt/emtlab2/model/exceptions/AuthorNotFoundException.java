package mk.ukim.finki.emt.emtlab2.model.exceptions;

public class AuthorNotFoundException extends RuntimeException{
    public AuthorNotFoundException(Long id){
        super(String.format("The author with id %d, was not found", id));
    }
}
