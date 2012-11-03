package com.thesis.executor;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class EmulatorExecutor {

	final JFrame mainFrame = new JFrame("Thread emulator");

	public EmulatorExecutor() {
		initFrame();

		mainFrame.setVisible(true);
	}

	private void initFrame(){
		mainFrame.setSize(Dimensions.FRAME_DIMENSION);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initConfigPanels(){}

	

	private static class Dimensions {
		private static final Dimension FRAME_DIMENSION = new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), 500);
	}

}