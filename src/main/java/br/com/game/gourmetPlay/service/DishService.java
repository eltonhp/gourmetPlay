package br.com.game.gourmetPlay.service;

import br.com.game.gourmetPlay.expection.DishNotNullException;
import br.com.game.gourmetPlay.model.Dish;
import br.com.game.gourmetPlay.model.Quality;

public class DishService {

    public Dish createDish(String name) {
        if(name == null) {
            throw new DishNotNullException("O nome do prato não pode ser vazio");
        }

        return  Dish.builder().name(name).build();
    }
}
