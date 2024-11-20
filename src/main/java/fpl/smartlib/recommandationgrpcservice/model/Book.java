package fpl.smartlib.recommandationgrpcservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Book {
    private long bookId ;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
}
