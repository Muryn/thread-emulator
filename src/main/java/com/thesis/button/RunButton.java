package com.thesis.button;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class RunButton extends JButton {

	private static final String DEFAULT_BUTTON_TITLE = "Run";
	private RunButtonAction actionListener = new RunButtonAction();

	public RunButton() {
		super(DEFAULT_BUTTON_TITLE);
		addActionListener(actionListener);
	}

	public RunButton(String buttonTitle) {
		super(buttonTitle);
	}

}