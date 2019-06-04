/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u7;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class IronImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = null;
        BufferedImage image = null;

        // IMAGES
        //  1. iron-puzzle.png
        //  2. copper-puzzle.png
        int imageNumber = 2;
        switch (imageNumber) {
            case 1:
                fileName = "iron-puzzle.png";
                break;
            case 2:
                fileName = "copper-puzzle.png";
                break;
        }

        // READ IMAGE
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // CREATE GUI
        DrawingPanel panel = new DrawingPanel(image.getWidth(), image.getHeight());
        //panel.setImage( image );

        switch (imageNumber) {
            case 1:
                panel.setImage(unhideIronPuzzle(image));
                break;
            case 2:
                panel.setImage(unhideCopperPuzzle(image));
                break;
        }
    }

    public static BufferedImage unhideIronPuzzle(BufferedImage image) {
        Color c;
        Color newColor;
        int r;
        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                c = new Color(image.getRGB(w, h));
                r = c.getRed() * 10;
                newColor = new Color(r, 0, 0);
                image.setRGB(w, h, newColor.getRGB());

            }
        }

        return image;
    }

    public static BufferedImage unhideCopperPuzzle(BufferedImage image) {
        Color c;
        Color newColor;
        int r, g, b;
        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                c = new Color(image.getRGB(w, h));
                r=0;
                g = Math.min(c.getGreen() * 20, 255);
                b = Math.min(c.getBlue() * 20, 255);
                newColor = new Color(r, g, b);
                image.setRGB(w, h, newColor.getRGB());
            }
        }

        return image;
    }

}
