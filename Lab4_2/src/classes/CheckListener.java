package classes;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextArea;


import javax.swing.JComponent;

public class CheckListener implements ActionListener{
	public ArrayList<JComponent> components = new ArrayList<JComponent>();
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		for (JComponent comp : components) {
			comp.setEnabled(!comp.isEnabled());
		}
	}
}
