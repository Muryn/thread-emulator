package com.thesis.panels;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import static com.thesis.panels.helper.PanelHelper.Dimensions.HEADER_PANEL_MAX_DIMENSION;
import static com.thesis.panels.helper.PanelHelper.StyleButtonHelper.styleButton;

@SuppressWarnings("serial")
public class HeaderControlPanel extends JPanel {

	final JButton runButton = new JButton("Run");
	final JButton exitButton = new JButton("Exit");

	public HeaderControlPanel() {
		setLayout(new GridBagLayout());
		setMaximumSize(HEADER_PANEL_MAX_DIMENSION);
		initButtons();
	}

	private void initButtons() {
		add(styleButton(runButton, "Run", null));
		add(Box.createRigidArea(new Dimension(100, 0)));//Empty space between buttons
		add(styleButton(exitButton, "Exit", null));
	}

}