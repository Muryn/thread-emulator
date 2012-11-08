package com.thesis.component.helper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class ComponentHelper {

	public static class CustomColors {
		public static final Color THREAD_CONTROL_BG = Color.decode("#C4C4C4");
		public static final Color THREAD_CONTROL_BORDER_COLOR = Color.orange;
		public static final Color DEFAULT_PANEL_BACKGROUND = Color.gray;
	}

	public static class Dimensions {
		public static final Dimension FRAME_DIMENSION = new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), 500);
		public static final Dimension HEADER_PANEL_MAX_DIMENSION = new Dimension(300000000, 500);
		public static final Dimension THREAD_CONTROLS_DIMENSION =  new Dimension(300, 300);
		public static final Dimension BUTTON_MAX_DIMENSION = new Dimension(80, 100);
		public static final Dimension SEPARATOR_DEFAULT_DIMENSION = new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), 10);
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
		private static final Insets DEFAULT_INSETS = new Insets(4, 2, 2, 2);

		public static GridBagConstraints constraints(Integer gridx, Integer gridy) {
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.gridx = gridx;
			constraints.gridy = gridy;
			constraints.insets = DEFAULT_INSETS;

			return constraints;
		}

		public static GridBagConstraints constraints(Integer gridx, Integer gridy, Integer gridHeight) {
			GridBagConstraints constraint = constraints(gridx, gridy);
			constraint.gridheight = gridHeight;
			constraint.ipady = 50;

			return constraint;
		}
	}

	public static class PanelHelper {
		public static JPanel emptyPanel(Color color) {
			JPanel jPanel = new JPanel();
			jPanel.setBackground(color == null ? Color.gray : color);
			return jPanel;
		}

		public static JSeparator verticalSeparator(Dimension separatorDim, Color separatorColor) {
			JSeparator jSeparator = new JSeparator(SwingConstants.HORIZONTAL);
			jSeparator.setPreferredSize(separatorDim == null ? Dimensions.SEPARATOR_DEFAULT_DIMENSION : separatorDim);
			//jSeparator.setBackground(separatorColor == null ? CustomColors.THREAD_CONTROL_BORDER_COLOR : separatorColor);
			jSeparator.setBackground(separatorColor == null ? Color.red : separatorColor);

			return jSeparator;
		}
	}

	public static class LabelHelper {
		public static JLabel label(String title) {
			JLabel label = new JLabel(title);

			return label;
		}
	}

	public static class ComboboxHelper {
		public static JComboBox combobox(String name, DefaultComboBoxModel model) {
			JComboBox comboBox = new JComboBox(model);
			comboBox.setName(name);

			return comboBox;
		}
	}

}