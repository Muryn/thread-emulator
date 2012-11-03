package com.thesis.panel;

import static com.thesis.component.helper.PanelHelper.Dimensions.HEADER_PANEL_MAX_DIMENSION;
import static com.thesis.component.helper.PanelHelper.StyleButtonHelper.styleButton;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import com.thesis.button.ExitButton;
import com.thesis.button.RunButton;

@SuppressWarnings("serial")
public class HeaderControlPanel extends JPanel {

	final RunButton runButton = new RunButton();
	final ExitButton exitButton = new ExitButton();

	public HeaderControlPanel() {
		setLayout(new GridBagLayout());
		setMaximumSize(HEADER_PANEL_MAX_DIMENSION);
		initButtons();
	}

	private void initButtons() {
		add(styleButton(runButton, "Run threads", null));
		add(Box.createRigidArea(new Dimension(100, 0)));//Empty space between buttons
		add(styleButton(exitButton, "Exit emulator", null));
	}

}