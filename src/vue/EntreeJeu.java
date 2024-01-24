package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField txtIP;
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Arene()).setVisible(true);
				dispose();
			}
		});
		btnStart.setBounds(197, 7, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new ChoixJoueur()).setVisible(true);
				dispose();
			}
		});
		btnConnect.setBounds(197, 49, 89, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(197, 83, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblStart = new JLabel("Start a server :");
		lblStart.setBounds(10, 11, 111, 14);
		contentPane.add(lblStart);
		
		JLabel lblConnect = new JLabel("Connect an existing server :");
		lblConnect.setBounds(10, 31, 186, 14);
		contentPane.add(lblConnect);
		
		JLabel lblIPServer = new JLabel("IP server : ");
		lblIPServer.setBounds(10, 52, 79, 14);
		contentPane.add(lblIPServer);
		
		txtIP = new JTextField();
		txtIP.setText("127.0.0.1");
		txtIP.setBounds(69, 49, 105, 20);
		contentPane.add(txtIP);
		txtIP.setColumns(10);
	}
	
}
