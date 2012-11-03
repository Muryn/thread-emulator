package com.thesis.component.helper;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;

public class PanelHelper {

	public static class Dimensions {
		public static final Dimension FRAME_DIMENSION = new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), 500);
		public static final Dimension HEADER_PANEL_MAX_DIMENSION = new Dimension(30000, 500);
	}

	public static class StyleButtonHelper {
		private static final Dimension DEFAULT_BUTTON_DIMENSION = new Dimension(80, 20);

		public static JButton styleButton(JButton button, String toolTipText, Dimension dimension) {
			button.setToolTipText(toolTipText);
			button.setPreferredSize(dimension == null ? DEFAULT_BUTTON_DIMENSION : dimension);

			return button;
		}
	}
}