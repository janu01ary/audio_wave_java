import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

	public MyFrame() {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		
		//panel
		MyPanel myPanel = new MyPanel();
		this.add(myPanel, BorderLayout.CENTER);
		
		Panel panel = new Panel(new FlowLayout());
		this.add(panel, BorderLayout.SOUTH);
		
		//component
		TextField t1 = new TextField(3);
		TextField t2 = new TextField(3);
		TextField t3 = new TextField(3);
		TextField t4 = new TextField(3);

		Label l1 = new Label("y=");
		Label l2 = new Label("x^3 +");
		Label l3 = new Label("x^2 +");
		Label l4 = new Label("x +");
		
		Button button = new Button("Set");
		
		//component add
		panel.add(l1); panel.add(t1);
		panel.add(l2); panel.add(t2);
		panel.add(l3); panel.add(t3);
		panel.add(l4); panel.add(t4);
		panel.add(button);
		
		//listener
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.setGraph(new MyGraph(
									Double.parseDouble(t1.getText()),
									Double.parseDouble(t2.getText()),
									Double.parseDouble(t3.getText()),
									Double.parseDouble(t4.getText())									
								));
				myPanel.repaint();
			}
		};
		button.addActionListener(actionListener);
		
	}

}
