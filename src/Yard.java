import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Yard  extends Frame {
    private static final int ROWS = 50;
    private static final int COLS = 50;
    private static final int BLOCK_SIZE =20;

    Image offScreenImage = null;

    public void paint(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.GRAY);
        g.fillRect(0,0,COLS * BLOCK_SIZE ,ROWS * BLOCK_SIZE);
        g.setColor(Color.DARK_GRAY);
        for(int i=0; i < ROWS-1; i++){
            g.drawLine(0,BLOCK_SIZE * i ,COLS * BLOCK_SIZE,  BLOCK_SIZE * i);
        }

        for(int i=0; i < COLS-1; i++){
            g.drawLine(BLOCK_SIZE * i,0 ,BLOCK_SIZE * i,  BLOCK_SIZE * ROWS);
        }

        g.setColor(c);
    }

    public void launchFrame(){
        this.setSize(COLS * BLOCK_SIZE ,ROWS * BLOCK_SIZE);
        this.setLocation(300, 20);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }

    public static void main(String[] args){
        new Yard().launchFrame();
    }
}
