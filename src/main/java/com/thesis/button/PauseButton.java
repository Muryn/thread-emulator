package com.thesis.button;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class PauseButton extends JButton {

	private static final String DEFAULT_BUTTON_TITLE = "Pause";

	public PauseButton() {
		super(DEFAULT_BUTTON_TITLE);
	}

	public PauseButton(String title) {
		super(title);
	}

}