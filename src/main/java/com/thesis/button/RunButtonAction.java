package com.thesis.button;

import static com.thesis.component.helper.ComponentHelper.PanelPainter.paint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.thesis.application.context.ApplicationContext;
import com.thesis.panel.VisualizerSection;

public class RunButtonAction implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		paint(ApplicationContext.panels(VisualizerSection.FIRST));
	}

}
