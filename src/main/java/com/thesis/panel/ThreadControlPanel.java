package com.thesis.panel;

import static com.thesis.component.helper.ComponentHelper.ComboboxHelper.combobox;
import static com.thesis.component.helper.ComponentHelper.ConstraintsHelper.constraints;
import static com.thesis.component.helper.ComponentHelper.CustomColors.THREAD_CONTROL_BG;
import static com.thesis.component.helper.ComponentHelper.CustomColors.THREAD_CONTROL_BORDER_COLOR;
import static com.thesis.component.helper.ComponentHelper.LabelHelper.label;
import static com.thesis.component.helper.ComponentHelper.PanelHelper.emptyPanel;

import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ThreadControlPanel extends JPanel {

	private final DefaultComboBoxModel PRIORITIES_MODEL = new DefaultComboBoxModel(new String[] {"1", "2", "3","4", "5", "6", "7", "8", "9", "10"});
	private final DefaultComboBoxModel ORDER_MODEL = new DefaultComboBoxModel(new String[]{"None", "1", "2", "3"});

	final JLabel header;
	final JComboBox priorityCombobox = combobox("Priority", PRIORITIES_MODEL);
	final JComboBox orderComboBox = combobox("Order", ORDER_MODEL);

	public ThreadControlPanel(String header) {
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createLineBorder(THREAD_CONTROL_BORDER_COLOR));
		setBackground(THREAD_CONTROL_BG);
		this.header = label(header);

		initComponent();
	}

	/**
	 * Layout:
	 * +----------------------------+-----------------------------------+---------------------------+
	 * |	empty(0,0)				|		Thread # Controls(1,0)		|	empty(2,0)				|
	 * +----------------------------+-----------------------------------+---------------------------+
	 * |	Priority(0,1)			|			empty(1,1)				|	Order(2,1)				|
	 * +----------------------------+-----------------------------------+---------------------------+
	 * |	priority combo box(0,2)	|			empty(1,2)				|	order combo box(2,2)	|
	 * +----------------------------+-----------------------------------+---------------------------+
	 */
	private void initComponent() {
		//----------	First row	--------------//
		add(emptyPanel(THREAD_CONTROL_BG), constraints(0, 0));
		add(header, constraints(1, 0));
		add(emptyPanel(THREAD_CONTROL_BG), constraints(2, 0));

		//---------		Second row		----------//
		add(label("Priority"), constraints(0, 1));
		add(emptyPanel(THREAD_CONTROL_BG), constraints(1, 1));
		add(label("Order"), constraints(2, 1));

		//---------		Third row	--------------//
		add(priorityCombobox, constraints(0, 2));
		add(emptyPanel(THREAD_CONTROL_BG), constraints(1, 2));
		add(orderComboBox, constraints(2, 2));
	}

}