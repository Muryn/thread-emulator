package com.thesis.button;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class StopButton extends JButton{

	private static final String DEFAULT_BUTTON_TITLE = "Stop";

	public StopButton() {
		super(DEFAULT_BUTTON_TITLE);
	}

	public StopButton(String title) {
		super(title);
	}

}
