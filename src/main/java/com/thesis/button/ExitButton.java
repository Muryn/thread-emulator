package com.thesis.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class ExitButton extends JButton {

	private static final String DEFAULT_BUTTON_TITLE = "Exit";
	private static final ActionListener DEFAULT_ACTION_LISTENER = new ActionListener() { public void actionPerformed(ActionEvent e) { System.exit(0); } };

	public ExitButton() {
		super(DEFAULT_BUTTON_TITLE);
		addActionListener(DEFAULT_ACTION_LISTENER);
	}

	public ExitButton(String title) {
		super(title);
	}
}