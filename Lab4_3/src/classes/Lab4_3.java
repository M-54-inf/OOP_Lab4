package classes;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class Lab4_3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab4_3");
		frame.setLocation(400, 400);
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		final JTextField name = new JTextField();
		final JTextField greeting = new JTextField();
		
		name.addCaretListener((CaretListener) new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent arg0) {
				greeting.setText("Привет, " + name.getText() + "!");
			}

		});
		
		frame.add(name, BorderLayout.NORTH);
		frame.add(greeting, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
