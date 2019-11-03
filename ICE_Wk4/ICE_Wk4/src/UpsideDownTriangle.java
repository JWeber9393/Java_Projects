import java.awt.Color;
import java.awt.Graphics;

public class UpsideDownTriangle {
    public static void main(String[] args) {
        DrawingPanel window = new DrawingPanel(600, 600);
        int w = window.getWidth(), h = window.getHeight();
        int x1 = 0, x2 = w, y1 = 0, y2 = y1;
        int d = 20;
        Graphics pen = window.getGraphics();
        pen.drawLine(0, 0, w / 2, h);
        pen.drawLine(window.getWidth(), 0, w / 2, h);
        pen.drawString("Joey Weber", 50, 500);
        pen.setColor(Color.RED);
        for (int i = 0; i <= h; i += d) {
            x1 += d/2;
            x2 -= d/2;
            y1 += d;
            y2 += d;
            pen.drawLine(x1, y1, x2, y2);
        }
    }
}
