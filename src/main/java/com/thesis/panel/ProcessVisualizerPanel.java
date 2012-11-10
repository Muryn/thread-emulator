package com.thesis.panel;

import static com.thesis.component.helper.ComponentHelper.CustomColors.DEFAULT_PANEL_BACKGROUND;
import static com.thesis.component.helper.ComponentHelper.ConstraintsHelper.constraints;
import static com.thesis.component.helper.ComponentHelper.PanelHelper.emptyPanel;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import com.thesis.button.PauseButton;
import com.thesis.button.StopButton;

@SuppressWarnings("serial")
public class ProcessVisualizerPanel extends JPanel{

	private static final Integer TWO_ROW_HEIGHT = 2;

	private final PauseButton thread1Pause = new PauseButton();
	private final StopButton thread1Stop = new StopButton();

	private final PauseButton thread2Pause = new PauseButton();
	private final StopButton thread2Stop = new StopButton();

	private final PauseButton thread3Pause = new PauseButton();
	private final StopButton thread3Stop = new StopButton();


	public ProcessVisualizerPanel() {
		setLayout(new GridBagLayout());
		setBackground(DEFAULT_PANEL_BACKGROUND);

		initComponent();
	}

	/**
	 * Layout:
	 * +----------------------------+-----------------------+
	 * |		Pause button(0, 0)	|						|
	 * +----------------------------+	Progress bar(1, 0)	|
	 * |		Stop button(0, 1)	|						|
	 * +----------------------------+-----------------------+
	 * |		Pause button(0, 2)	|						|
	 * +----------------------------+	Progress bar(1,2)	|
	 * |		Stop button(0,3)	|						|
	 * +----------------------------+-----------------------+
	 * |		Pause button(0, 4)	|						|
	 * |----------------------------+	Progress bar(1, 4)	|
	 * |		Stop button(0, 5)	|						|
	 * +----------------------------+-----------------------+
	 */
	private void initComponent() {
		add(thread1Pause, constraints(0, 0));
		add(thread1Stop, constraints(0, 1));
		generateProgressPanels(1, 0);

		add(thread2Pause, constraints(0, 2));
		add(thread2Stop, constraints(0, 3));
		generateProgressPanels(1, 2);

		add(thread3Pause, constraints(0, 4));
		add(thread3Stop, constraints(0, 5));
		generateProgressPanels(1, 4);

	}

	private void generateProgressPanels(Integer firstColumn, Integer rowNumber) {
		for(int i = 0; i < 95; i ++) {
			add(emptyPanel(Color.red), constraints(firstColumn++, rowNumber, TWO_ROW_HEIGHT));
		}
	}

}