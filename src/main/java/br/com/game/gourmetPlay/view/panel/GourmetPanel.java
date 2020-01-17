package br.com.game.gourmetPlay.view.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Elton H. Paula
 */
public class GourmetPanel extends JPanel {
    public GourmetPanel() {
        this.init();
    }

    private void init() {
        setLayout(new BorderLayout());

        JPanel painel = new JPanel();
        painel.add(new JLabel("Pense em um prato que gosta"));

        JPanel painelProgress = new JPanel();
        painelProgress.setLayout(new BoxLayout(painelProgress, BoxLayout.PAGE_AXIS));

        painelProgress.add(this.createOKButton());

//        JLabel label2 = new JLabel("JOption Panel");
//        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
//        painelProgress.add(label2);

        add(painel, BorderLayout.NORTH);
        add(painelProgress, BorderLayout.CENTER);

    }

    private Component createOKButton() {
        JButton okButton = new JButton("OK");
        okButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        okButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (JOptionPane.showConfirmDialog(null,
                        "O prato que você pensou é massa?",
                        "Confirm",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "acertei!", "Confirm", JOptionPane.INFORMATION_MESSAGE);

                } else if (JOptionPane.showConfirmDialog(null,
                        "O prato que você pensou é chocolate?",
                        "Confirm",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "acertei!", "Confirm", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    String dish= JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Desito", JOptionPane.QUESTION_MESSAGE);
                    String dishThought = JOptionPane.showInputDialog(null, dish + " é ____________ mas bolo de chocolate não", "Complete", JOptionPane.QUESTION_MESSAGE);
                    System.out.println(dish);
                    System.out.println(dishThought);
                }

            }
        });
        return okButton;
    }
}
