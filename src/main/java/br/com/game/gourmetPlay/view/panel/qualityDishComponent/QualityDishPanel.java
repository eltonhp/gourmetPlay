package br.com.game.gourmetPlay.view.panel.qualityDishComponent;

import br.com.game.gourmetPlay.view.panel.qualityDishComponent.listener.OkButtonMouseAdapter;


import javax.swing.*;
import java.awt.*;

/**
 * @author Elton H. Paula
 */

public class QualityDishPanel extends JPanel {
    public QualityDishPanel() {
        this.init();
    }

    private void init() {
        initGourmetPanel();
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

    private Component createOKButton() {
        JButton okButton = new JButton("OK");
        okButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        OkButtonMouseAdapter okButtonMouseAdapter = new OkButtonMouseAdapter();
        okButton.addMouseListener(okButtonMouseAdapter);
        return okButton;
    }
}