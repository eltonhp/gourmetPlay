package br.com.game.gourmetPlay.view.panel.qualityDishComponent.listener;

import br.com.game.gourmetPlay.model.Dish;
import br.com.game.gourmetPlay.model.Quality;
import br.com.game.gourmetPlay.service.DishService;
import br.com.game.gourmetPlay.service.QualityDishService;
import br.com.game.gourmetPlay.service.QualityService;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Elton H. Paula
 */
public class OkButtonMouseAdapter extends MouseAdapter {
    QualityDishService qualityDishService;
    QualityService qualityService;
    DishService dishService;
    Dish foundDish = null;
    Quality qualityParent  = null;

    public OkButtonMouseAdapter(Quality quality) {
        this.qualityParent = quality;
        this.initServices();
    }

    private void initServices() {
        this.dishService = new DishService();
        this.qualityService = new QualityService();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.checkDish(qualityParent);
        this.foundDish = null;
    }


    private boolean showConfirmDish(String name) {
        return (JOptionPane.showConfirmDialog(null,
                "O prato que você pensou é "+name + "?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);
    }

    private void addNewDishAndQuality(Quality quality) {
        String thoughtDish = JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Desito", JOptionPane.QUESTION_MESSAGE);
        String dishQuality = JOptionPane.showInputDialog(null, thoughtDish + " é ____________ mas " + quality.getDish().getName() + " não", "Complete", JOptionPane.QUESTION_MESSAGE);

        this.foundDish = this.dishService.createDish(thoughtDish);
        Quality q = this.qualityService.createQuality(this.foundDish, dishQuality);
        quality.getQualities().add(q);
    }


    private void checkDish(Quality quality) {
        quality.getQualities().stream().forEach(q -> {
            if(this.foundDish == null && showConfirmDish(q.getNome())) {
                this.checkDish(q);
            }
        });
        if(this.foundDish == null && showConfirmDish(quality.getDish().getName())) {
            JOptionPane.showMessageDialog(null, "acertei!", "Confirm", JOptionPane.INFORMATION_MESSAGE);
            this.foundDish = quality.getDish();
        }
        if(this.foundDish == null) {
            addNewDishAndQuality(quality);
        }
    }
}
