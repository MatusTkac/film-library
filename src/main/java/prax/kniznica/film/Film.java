package prax.kniznica.film;


import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {

    private int id;
    private String name;
    private String author;
    private String genre;


}
