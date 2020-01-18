package br.com.game.gourmetPlay.service;

import br.com.game.gourmetPlay.model.Dish;
import br.com.game.gourmetPlay.model.Quality;

import java.util.ArrayList;

/**
 * @author Elton H. Paula
 */
public class QualityService {

    public Quality createQuality(String name) {
       return this.createQuality(null, name);
    }

    public Quality createQuality() {
       return this.createQuality(null);
    }

    public Quality createQuality(Dish dish, String qualityName) {
        Quality quality = Quality.builder()
                .nome(qualityName)
                .dish(dish)
                .qualities(new ArrayList<Quality>())
                .build();

        if(dish != null) {
            dish.setQuality(quality);
        }

        return quality;
    }
}
