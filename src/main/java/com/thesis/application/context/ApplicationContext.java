package com.thesis.application.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

import com.thesis.panel.VisualizerSection;

public final class ApplicationContext {

	private static final Map<VisualizerSection, List<JPanel>> sectionToPanels = new HashMap<VisualizerSection, List<JPanel>>();

	public static List<JPanel> panels(VisualizerSection section) {
		if(sectionToPanels.get(section) != null) {
			return sectionToPanels.get(section);
		}
		sectionToPanels.put(section, new ArrayList<JPanel>());
		return sectionToPanels.get(section);
	}

}