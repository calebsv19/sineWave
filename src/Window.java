import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {

    private static final long serialVersionUID = -7259108873705494293L;

    public Window (int x, int y, String title, Game game){
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(x, y));
        frame.setMaximumSize(new Dimension(x, y));
        frame.setMinimumSize(new Dimension(x, y));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();
    }
}