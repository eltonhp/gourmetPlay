package br.com.game.gourmetPlay.view.panel.qualityDishComponent;

import br.com.game.gourmetPlay.service.QualityDishService;
import br.com.game.gourmetPlay.view.panel.qualityDishComponent.listener.OkButtonMouseAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Elton H. Paula
 */

public class QualityDishPanel extends JPanel {

    QualityDishService qualityDishService;

    public QualityDishPanel() {
        this.init();
    }

    private void init() {
        initServices();
        initGourmetPanel();
    }

    private void initServices() {
        this.qualityDishService = new QualityDishService();
    }

    private void initGourmetPanel() {
        setLayout(new BorderLayout());

        JPanel painel = new JPanel();
        painel.add(new JLabel("Pense em um prato que gosta"));

        JPanel painelProgress = new JPanel();
        painelProgress.setLayout(new BoxLayout(painelProgress, BoxLayout.PAGE_AXIS));

        painelProgress.add(this.createOKButton());
        add(painel, BorderLayout.NORTH);
        add(painelProgress, BorderLayout.CENTER);
    }

    private void loadQualityDish() {
        this.loadQualityDish();
    }

    private Component createOKButton() {
        JButton okButton = new JButton("OK");
        okButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        OkButtonMouseAdapter okButtonMouseAdapter = new OkButtonMouseAdapter(this.qualityDishService.getQualityDefault());
        okButton.addMouseListener(okButtonMouseAdapter);
        return okButton;
    }
}