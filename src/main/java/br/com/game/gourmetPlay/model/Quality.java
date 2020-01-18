package br.com.game.gourmetPlay.model;

import lombok.*;

import java.util.List;

/**
 * @author Elton H. Paula
 */
@Data
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Quality {
    private String nome;
    private Dish dish;
    private List<Quality> qualities;
}
