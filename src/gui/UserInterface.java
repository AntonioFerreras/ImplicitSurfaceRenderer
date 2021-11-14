package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import math.IntegerVector;

import java.awt.BorderLayout;

public class UserInterface {

	private static JFrame frame;

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public static void initialize() {
		frame = new JFrame();
		frame.setTitle("Implicit Surface Renderer");
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Display display = new Display(new IntegerVector(frame.getContentPane().getWidth(), frame.getContentPane().getHeight()));
		
		frame.getContentPane().add(display);
	}

}
