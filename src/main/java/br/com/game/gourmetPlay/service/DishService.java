package br.com.game.gourmetPlay.service;
import br.com.game.gourmetPlay.model.Dish;


public class DishService {

    public Dish createDish(String name) {
        return  Dish.builder().name(name).build();
    }
}
