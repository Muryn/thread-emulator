package com.thesis.panel;

import static com.thesis.component.helper.ComponentHelper.Dimensions.THREAD_CONTROLS_DIMENSION;
import static com.thesis.component.helper.ComponentHelper.ComboboxHelper.combobox;
import static com.thesis.component.helper.ComponentHelper.ComboboxHelper.PRIORITIES_MODEL;
import static com.thesis.component.helper.ComponentHelper.ComboboxHelper.ORDER_MODEL;
import static com.thesis.component.helper.ComponentHelper.ConstraintsHelper.constraints;
import static com.thesis.component.helper.ComponentHelper.PanelHelper.emptyPanel;
import static com.thesis.component.helper.ComponentHelper.LabelHelper.label;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ThreadControlPanel extends JPanel {

	final JLabel header;
	final JComboBox priorityCombobox = combobox("Priority", PRIORITIES_MODEL);
	final JComboBox orderComboBox = combobox("Order", ORDER_MODEL);

	public ThreadControlPanel(String header) {
		this.header = label(header);
		setMaximumSize(THREAD_CONTROLS_DIMENSION);

		initComponent();
	}

	/**
	 * Layout:
	 * +--------------------+---------------------------+-------------------+
	 * |	empty(0,0)		|	Thread # Controls(0,1)	|	empty(0,2)		|
	 * +--------------------+---------------------------+-------------------+
	 * |	Priority(1,0)	|			empty(1,1)		|	Order(1,2)		|
	 * +--------------------+---------------------------+-------------------+
	 * |	combo box(2,0)	|			empty(2,1)		|	combo box(2,2)	|
	 * +--------------------+---------------------------+-------------------+
	 */
	private void initComponent() {
		//----------	First row	--------------//
		add(emptyPanel(), constraints(0, 0));
		add(header, constraints(0, 1));
		add(emptyPanel(), constraints(0, 2));

		//---------		Second row		----------//
		add(label("Priority"), constraints(1, 0));
		add(emptyPanel(), constraints(1, 1));
		add(label("Order"), constraints(1, 2));
	}

}