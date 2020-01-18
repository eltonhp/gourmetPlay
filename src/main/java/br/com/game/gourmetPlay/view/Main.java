package br.com.game.gourmetPlay.view;

import br.com.game.gourmetPlay.view.panel.qualityDishComponent.QualityDishPanel;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elton H. Paula
 */
@Component
public class Main extends JFrame {

    public Main() {
        super("Jogo Gourmet");
        this.init();
    }

    private void init() {
        JDesktopPane mainFrame = new JDesktopPane();
        this.getContentPane().add(mainFrame);
        this.createPanel();
        this.setSize(300,150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createPanel() {
        this.setContentPane(new QualityDishPanel());
        this.setPreferredSize(new Dimension(300, 150));
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
