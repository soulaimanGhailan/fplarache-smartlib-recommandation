package fpl.smartlib.recommandationgrpcservice.entities;


import fpl.smartlib.recommandationgrpcservice.model.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private long userId ;
    private long createdAT ;
    @Transient
    private List<Book> books ;
}
