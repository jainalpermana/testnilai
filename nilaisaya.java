import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nilaisaya extends JFrame {

	private JPanel contentPane;
	private JTextField nama;
	private JTextField nilai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nilaisaya frame = new nilaisaya();
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
	public nilaisaya() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setBounds(10, 25, 46, 14);
		contentPane.add(lblNama);
		
		nama = new JTextField();
		nama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nama.setBounds(10, 50, 86, 20);
		contentPane.add(nama);
		nama.setColumns(10);
		
		JLabel lblNilai = new JLabel("Nilai");
		lblNilai.setBounds(10, 81, 46, 14);
		contentPane.add(lblNilai);
		
		nilai = new JTextField();
		nilai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nilai.setBounds(10, 106, 86, 20);
		contentPane.add(nilai);
		nilai.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String namaku = nama.getText();
				String nilaiku = nilai.getText();
				String grade, keterangan;
				int nilaikuda = Integer.parseInt(nilaiku);
				
				if(nilaikuda >= 90 ){
					grade="A";
					keterangan=" Pulang!";
				}else if(nilaikuda >= 80){
					grade="B";
					keterangan=" Pulang!";
				}else if(nilaikuda >= 70){
					grade="C";
					keterangan=" Pulang!";
				}else if(nilaikuda >= 60){
					grade="D";
					keterangan=" Pulang!";
				}else{
					grade="E";
					keterangan=" Nginep!";
					
				}
				
				JOptionPane.showMessageDialog(null, namaku + grade + keterangan);
				
			}
		});
		btnOk.setBounds(7, 148, 89, 23);
		contentPane.add(btnOk);
	}
}
