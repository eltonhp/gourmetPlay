package br.com.game.gourmetPlay.service;


import br.com.game.gourmetPlay.model.Quality;



/**
 * @author Elton H Paula
 */
public class QualityDishService {
    public DishService dishService;
    public QualityService qualityService;

    public QualityDishService() {
        this.dishService = new DishService();
        this.qualityService = new QualityService();
    }

    public Quality getQualityDefault() {
        Quality qualityParent =  this.qualityService.createQuality();
        qualityParent.setDish(this.dishService.createDish("Bolo de Chocolate"));
        Quality quality = this.qualityService.createQuality("massa");
        quality.setDish(this.dishService.createDish("Lasanha"));
        qualityParent.getQualities().add(quality);
        return qualityParent;
    }
}
