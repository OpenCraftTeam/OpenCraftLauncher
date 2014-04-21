package hu.OpenCraft.Launcher.frames;

import hu.OpenCraft.Launcher.stores.ClientManager;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = ClientManager.SERIAL;
	private JPanel contentPane;


	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
