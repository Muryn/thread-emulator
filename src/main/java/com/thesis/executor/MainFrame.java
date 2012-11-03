package com.thesis.executor;

import javax.swing.JFrame;

import com.thesis.panels.HeaderControlPanel;

import static com.thesis.panels.helper.PanelHelper.Dimensions.FRAME_DIMENSION;;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	public MainFrame() {
		initFrame();
		setVisible(true);
	}

	private void initFrame(){
		setSize(FRAME_DIMENSION);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addPanels();
	}

	private void addPanels() {
		//Main control panel
		add(new HeaderControlPanel());
	}
}