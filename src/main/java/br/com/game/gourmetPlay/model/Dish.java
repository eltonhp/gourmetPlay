package br.com.game.gourmetPlay.model;

import lombok.*;

/**
 * @author Elton H. Paula
 */
@Data
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dish {
    private String name;
    private Quality quality;
}
