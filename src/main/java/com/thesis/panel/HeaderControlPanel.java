package com.thesis.panel;

import static com.thesis.component.helper.ComponentHelper.Dimensions.HEADER_PANEL_MAX_DIMENSION;
import static com.thesis.component.helper.ComponentHelper.StyleButtonHelper.styleButton;
import static com.thesis.component.helper.ComponentHelper.ConstraintsHelper.constraints;
import static com.thesis.component.helper.ComponentHelper.PanelHelper.emptyPanel;

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
	final ThreadControlPanel thread1Controls = new ThreadControlPanel("Thread #1 controls");

	public HeaderControlPanel() {
		setLayout(new GridBagLayout());
		setMaximumSize(HEADER_PANEL_MAX_DIMENSION);

		initComponent();
	}

	/**
	 * +----------------------------+---------------------------+---------------------------+
	 * |	Run button(0,0)			|	empty space(1,0)		|	Exit button(2,0)		|
	 * +----------------------------+---------------------------+---------------------------+
	 * |	Thread 1 controls(1,0)	|	Thread 2 controls(1,1)	|	Thread 3 controls(1,2)	|
	 * +----------------------------+---------------------------+---------------------------+
	 */
	private void initComponent() {
		//----------	First row	---------------//
		add(runButton, constraints(0, 0));
		add(emptyPanel(), constraints(1, 0));
		add(exitButton, constraints(2, 0));

		//----------	Second row	---------------//
		add(emptyPanel(), constraints(0, 0));
	}
}