package Other;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Window_start.FuckMainWindow;
import Window_start.FuckMainWindowRu;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class Lang extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lang frame = new Lang();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Lang() {
		setUndecorated(true);
		setBounds(332, 200, 272, 233);
		contentPane = new JPanel();
		contentPane.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setPreferredSize(new Dimension(0, 0));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Ru = new JButton("");
		Ru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				 
				 new FuckMainWindowRu().setVisible(true);	
				 setVisible(false);				
				}
		});
		Ru.setBounds(10, 98, 112, 46);
		Ru.setBorderPainted(false);
		Ru.setContentAreaFilled(false);
		Ru.setFocusPainted(false);
		contentPane.add(Ru);
		
		JButton Eng = new JButton("");
		Eng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				 
				 new FuckMainWindow().setVisible(true);	
				 setVisible(false);				
				}
		});
		Eng.setBounds(152, 98, 110, 46);
		Eng.setBorderPainted(false);
		Eng.setContentAreaFilled(false);
		Eng.setFocusPainted(false);
		contentPane.add(Eng);
		
		JLabel label = new JLabel("");
		
		Image img = new ImageIcon(this.getClass().getResource("iz.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 272, 233);
		
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		label_1.setBounds(0, 0, 23, 22);
		contentPane.add(label_1);
	}

}
