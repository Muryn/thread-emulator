package com.thesis.panel;

import static com.thesis.component.helper.ComponentHelper.ConstraintsHelper.constraints;
import static com.thesis.component.helper.ComponentHelper.PanelHelper.emptyPanel;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import com.thesis.button.ExitButton;
import com.thesis.button.RunButton;

@SuppressWarnings("serial")
public class HeaderControlPanel extends JPanel {

	final RunButton runButton = new RunButton();
	final ExitButton exitButton = new ExitButton();

	final ThreadControlPanel thread1Controls = new ThreadControlPanel("Thread #1 controls");
	final ThreadControlPanel thread2Controls = new ThreadControlPanel("Thread #2 controls");
	final ThreadControlPanel thread3Controls = new ThreadControlPanel("Thread #3 controls");

	public HeaderControlPanel() {
		setLayout(new GridBagLayout());
		setBackground(Color.gray);

		initComponent();
	}

	/**
	 * Layout:
	 * +----------------------------+---------------------------+---------------------------+
	 * |	Run button(0,0)			|	empty space(1,0)		|	Exit button(2,0)		|
	 * +----------------------------+---------------------------+---------------------------+
	 * |	Thread 1 controls(0,1)	|	Thread 2 controls(1,1)	|	Thread 3 controls(2,1)	|
	 * +----------------------------+---------------------------+---------------------------+
	 */
	private void initComponent() {
		//----------	First row	---------------//
		add(runButton, constraints(0, 0));
		add(emptyPanel(null), constraints(1, 0));
		add(exitButton, constraints(2, 0));

		//----------	Second row	---------------//
		add(thread1Controls, constraints(0,1));
		add(thread2Controls, constraints(1, 1));
		add(thread3Controls, constraints(2, 1));

	}
}