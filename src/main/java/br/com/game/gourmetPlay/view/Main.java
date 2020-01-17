package br.com.game.gourmetPlay.view;

import br.com.game.gourmetPlay.view.panel.GourmetPanel;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elton H. Paula
 */
@Component
public class Main extends JFrame {

    private JInternalFrame internal;

    public Main() {
        super("Jogo Gourmet");
        this.init();
    }

    private void init() {
        JDesktopPane mainFrame = new JDesktopPane();
        this.getContentPane().add(mainFrame);
        this.createPanel();
        this.setSize(640,480);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createPanel() {
        this.setContentPane(new GourmetPanel());
        this.setPreferredSize(new Dimension(500, 300));
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
