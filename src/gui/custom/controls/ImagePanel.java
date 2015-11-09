package gui.custom.controls;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1138277352811104456L;
	BufferedImage image;
    Dimension size = new Dimension();
  
    public ImagePanel() { }
  
    public ImagePanel(BufferedImage image) {
        this.image = image;
        setComponentSize();
    }
  
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
  
    public Dimension getPreferredSize() {
        return size;
    }
  
    public void setImage(File file) {
    	try {
			image = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        setComponentSize();
        repaint();
    }
  
    private void setComponentSize() {
        if(image != null) {
            size.width  = image.getWidth();
            size.height = image.getHeight();
            revalidate();
        }
    }
}