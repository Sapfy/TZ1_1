package Window_start;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import Other.AddRu;
import Other.ClouseRu;
import Other.DelRu;
import java.awt.event.ActionListener;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;


public class VelWinRu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VelWinRu frame = new VelWinRu();
					frame.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//��� ����� Frame 
	public VelWinRu() {
		setBackground(Color.BLACK);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 163, 170);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(0, 0));
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
//������������ JLabel ���� �� �����.		
		contentPane.setLayout(null);
		
//������
		
		JButton Add = new JButton("");
		Add.setVisible(true);
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new AddRu().setVisible(true);						
			}
		});
		Add.setFocusPainted(false);
		Add.setSelected(true);
		Image img = new ImageIcon(this.getClass().getResource("addRu.png")).getImage();
		Add.setIcon(new ImageIcon(img));
		
		Add.setBorderPainted(false);
		Add.setContentAreaFilled(false);
		Add.setForeground(Color.WHITE);
		Add.setBounds(21, 12, 120, 55);
		contentPane.add(Add);
		
		JButton del = new JButton("");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new DelRu().setVisible(true);	
				
				
			}
		});
		
		Image img2 = new ImageIcon(this.getClass().getResource("del2Ru.png")).getImage();
		del.setIcon(new ImageIcon(img2));
		
		del.setSelected(true);
		del.setForeground(Color.WHITE);
		del.setFocusPainted(false);
		del.setContentAreaFilled(false);
		del.setBorderPainted(false);
		del.setBounds(21, 65, 120, 55);
		contentPane.add(del);
		
		JButton clear = new JButton("");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new ClouseRu().setVisible(true);	
				
				
			}
		});
		
		Image img3 = new ImageIcon(this.getClass().getResource("clearRu.png")).getImage();
		clear.setIcon(new ImageIcon(img3));
		
		clear.setSelected(true);
		clear.setForeground(Color.WHITE);
		clear.setFocusPainted(false);
		clear.setContentAreaFilled(false);
		clear.setBorderPainted(false);
		clear.setBounds(21, 119, 120, 55);
		contentPane.add(clear);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 163, 170);
		Image img4 = new ImageIcon(this.getClass().getResource("lol2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img4));
		
		
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.add(lblNewLabel);
		
	}
}
