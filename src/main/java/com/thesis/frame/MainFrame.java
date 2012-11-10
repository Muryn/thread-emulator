package com.thesis.frame;

import static com.thesis.component.helper.ComponentHelper.Dimensions.FRAME_DIMENSION;
import static com.thesis.component.helper.ComponentHelper.ConstraintsHelper.constraints;
import static com.thesis.component.helper.ComponentHelper.PanelHelper.verticalSeparator;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import com.thesis.panel.HeaderControlPanel;
import com.thesis.panel.ProcessVisualizerPanel;

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
		add(new HeaderControlPanel(), constraints(0, 0));
		add(verticalSeparator(null, Color.yellow), constraints(0, 1));
		add(new ProcessVisualizerPanel(), constraints(0, 2));
	}
}