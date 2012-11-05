package com.thesis.component.helper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComponentHelper {

	public static class Dimensions {
		public static final Dimension FRAME_DIMENSION = new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), 500);
		public static final Dimension HEADER_PANEL_MAX_DIMENSION = new Dimension(30000, 500);
		public static final Dimension THREAD_CONTROLS_DIMENSION =  new Dimension(300, 300);
	}

	public static class StyleButtonHelper {
		private static final Dimension DEFAULT_BUTTON_DIMENSION = new Dimension(80, 20);

		public static JButton styleButton(JButton button, String toolTipText, Dimension dimension) {
			button.setToolTipText(toolTipText);
			button.setPreferredSize(dimension == null ? DEFAULT_BUTTON_DIMENSION : dimension);

			return button;
		}
	}

	public static class ConstraintsHelper {
		public static GridBagConstraints constraints(Integer x, Integer y) {
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.gridx = x;
			constraints.gridy = y;

			return constraints;
		}
	}

	public static class PanelHelper {
		public static JPanel emptyPanel() {
			JPanel jPanel = new JPanel();
			jPanel.setBackground(Color.yellow);

			return jPanel;
		}
	}

	public static class LabelHelper {
		public static JLabel label(String title) {
			JLabel label = new JLabel(title);

			return label;
		}
	}

	public static class ComboboxHelper {
		public static final DefaultComboBoxModel PRIORITIES_MODEL = new DefaultComboBoxModel(new String[] {"1", "2", "3","4", "5", "6", "7", "8", "9", "10"});
		public static final DefaultComboBoxModel ORDER_MODEL = new DefaultComboBoxModel(new String[]{"None", "1", "2", "3"});

		public static JComboBox combobox(String name, DefaultComboBoxModel model) {
			JComboBox comboBox = new JComboBox(model);
			comboBox.setName(name);

			return comboBox;
		}
	}

}