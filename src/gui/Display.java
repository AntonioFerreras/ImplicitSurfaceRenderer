package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import math.IntegerVector;

public class Display extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7079836561433048304L;
	IntegerVector resolution;
	BufferedImage frameBuffer;
	
	public Display(IntegerVector resolution) {
		this.resolution = resolution;
		setSize(resolution.comps[0], resolution.comps[1]);
	}
	
	public void update(BufferedImage fb) {
		this.frameBuffer = fb;
		repaint();
	}
	
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(170, 25, 25));
        g2d.fillRect(0, getHeight()-1, getWidth(), 1);
	}
}
