package mk.ukim.finki.emt.emtlab2.model.dto;

import lombok.Data;
import mk.ukim.finki.emt.emtlab2.model.enums.Category;

@Data
public class BookDto {
    private String name;
    private Long author;
    private Category category;
    private Integer availableCopies;

    public void Book(){

    }
    public void Book(String name, Category category, Long author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
