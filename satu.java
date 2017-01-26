import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class satu extends JFrame {

	private JPanel contentPane;
	private JTextField angka1;
	private JTextField angka2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					satu frame = new satu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public satu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngka = new JLabel("Angka");
		lblAngka.setBounds(10, 27, 46, 14);
		contentPane.add(lblAngka);
		
		angka1 = new JTextField();
		angka1.setBounds(46, 24, 86, 20);
		contentPane.add(angka1);
		angka1.setColumns(10);
		
		JLabel lblAngka_1 = new JLabel("Angka");
		lblAngka_1.setBounds(10, 68, 46, 14);
		contentPane.add(lblAngka_1);
		
		angka2 = new JTextField();
		angka2.setBounds(46, 65, 86, 20);
		contentPane.add(angka2);
		angka2.setColumns(10);
		
		JRadioButton rdbtnTambah = new JRadioButton("Tambah");
		buttonGroup.add(rdbtnTambah);
		rdbtnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnTambah.setBounds(6, 112, 109, 23);
		contentPane.add(rdbtnTambah);
		
		JRadioButton rdbtnKurang = new JRadioButton("Kurang");
		buttonGroup.add(rdbtnKurang);
		rdbtnKurang.setBounds(6, 139, 109, 23);
		contentPane.add(rdbtnKurang);
		
		JRadioButton rdbtnKali = new JRadioButton("Kali");
		buttonGroup.add(rdbtnKali);
		rdbtnKali.setBounds(121, 112, 109, 23);
		contentPane.add(rdbtnKali);
		
		JRadioButton rdbtnBagi = new JRadioButton("Bagi");
		buttonGroup.add(rdbtnBagi);
		rdbtnBagi.setBounds(117, 139, 109, 23);
		contentPane.add(rdbtnBagi);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka11= angka1.getText();
				String angka22 = angka2.getText();
				int angka111= Integer.parseInt(angka11);
				int angka222= Integer.parseInt(angka22);
				int nilai;
				String keterangan;
				
				if(rdbtnTambah.isSelected()){
					nilai = angka111 + angka222;
					keterangan = "tambah";
				}else if(rdbtnKurang.isSelected()){
				    nilai = angka111 - angka222;
				    keterangan = "kurang";
				}else if(rdbtnKali.isSelected()){
				    nilai = angka111 * angka222;
				    keterangan = "kali";
				}else{
				    nilai = angka111 / angka222;
				    keterangan = "bagi";
				    
				
			}
			 JOptionPane.showConfirmDialog(null, angka11 + " " + keterangan + " " + angka22 + " = " + nilai);
				    
			}    
		});
		btnOk.setBounds(43, 183, 89, 23);
		contentPane.add(btnOk);
	}
}
