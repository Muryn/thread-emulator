package com.thesis.executor;

import static com.thesis.component.helper.ComponentHelper.Dimensions.FRAME_DIMENSION;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

import com.thesis.panel.HeaderControlPanel;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	public MainFrame() {
		initFrame();
		setVisible(true);
	}

	private void initFrame(){
		setLayout(new GridBagLayout());
		setSize(FRAME_DIMENSION);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addPanels();
	}

	private void addPanels() {
		add(new HeaderControlPanel());
	}
}