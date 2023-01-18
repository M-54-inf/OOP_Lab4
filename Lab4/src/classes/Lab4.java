package classes;
import java.awt.BorderLayout;
import javax.swing.*;

public class Lab4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab4");
		frame.setLocation(200,200);
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JComboBox<String> box = 
				new JComboBox<String>(Information.LANGUAGES);
		
		JTextArea area = new JTextArea();
		area.setText("Выберите язык");
		area.setEditable(false);
		
		BoxListener myListener = new BoxListener(box, area);
		box.addActionListener(myListener);
		
		frame.add(box, BorderLayout.SOUTH);
		frame.add(area, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
