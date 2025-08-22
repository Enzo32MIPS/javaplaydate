import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	JButton rst;
	int count = 0;

	public GUI(){

		frame = new JFrame();
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));


		frame.add(panel, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("MY GUI");

		frame.pack();
		frame.setVisible(true);
		frame.setSize(640,400);

		label = new JLabel("Número de cliques: 0");
		button = new JButton("Click me!");
		rst = new JButton("Reset");
		button.addActionListener(this);
		rst.addActionListener(this);
		panel.add(button);
		panel.add(rst);
		panel.add(label);

	}

	public static void main (String[] args ){
		new GUI();
	}

	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();

		JButton botao = (JButton)source;

		switch(botao.getText()){

			case "Click me!":
				count++;
				label.setText("Número de cliques: " + count);
			break;

			case "Reset":
				count = 0;
				label.setText("Número de cliques: 0");
			break;
		}

	}
}