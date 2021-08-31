import java.awt.*;

public class Waves {
    private double t;
    private int lines;
    private int start;

    public Waves(int lines, double t, int start){
        this.t = t;
        this.lines = lines;
        this.start = start;
    }

    public void tick(int height, int width){
        t += .01;
    }

    public void render(Graphics g, int width, int height){

        g.setColor(Color.WHITE);
        for (int i = 0; i < lines; i++){
            int length = (int) (Math.tan(t + .1 * i) * (height - 100) / 4);
            g.drawLine(start + i * 30, height / 2 - length / 2, start + i * 30, height / 2 + length / 2);
        }
    }
}
