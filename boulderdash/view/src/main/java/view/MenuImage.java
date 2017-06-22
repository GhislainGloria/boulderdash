package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Graphics;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class MenuImage extends JPanel {
    private BufferedImage imageFile;
    private String imagePath = "/home/martin/git/boulderdash/boulderdash/view/src/main/java/view/mainMenuImage.jpg";

    /**
     * Class constructor
     */
    public MenuImage() {
        try {
            this.imageFile = ImageIO.read(new File(this.imagePath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Paints the component itself
     *
     * @param  g  Graphics element
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(this.imageFile, 0, 0, null);
    }
}