package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoixJoueur extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	
	/**
	 * Initialisation des fonction des boutons
	 */
	private void btnLeft_click() {
		System.out.println("Précédent");
	}
	private void btnRight_click() {
		System.out.println("Suivant");
	}
	private void btnGo_click() {
		(new Arene()).setVisible(true);
		dispose();
	}
	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImageChoix = new JLabel("");
		lblImageChoix.setIcon(new ImageIcon(ChoixJoueur.class.getResource("/fonds/fondchoix.jpg")));
		lblImageChoix.setBounds(0, 0, 400, 273);
		contentPane.add(lblImageChoix);
		
		txtName = new JTextField();
		txtName.setBounds(140, 244, 123, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblLeft = new JLabel("");
		lblLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLeft_click();
			}
		});
		lblLeft.setBounds(63, 150, 37, 34);
		contentPane.add(lblLeft);
		
		JLabel lblRight = new JLabel("");
		lblRight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRight_click();
			}
		});
		lblRight.setBounds(300, 150, 37, 34);
		contentPane.add(lblRight);
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGo_click();
			}
		});
		lblGo.setBounds(310, 195, 65, 61);
		contentPane.add(lblGo);
	}
}
