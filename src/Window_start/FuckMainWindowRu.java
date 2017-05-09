package Window_start;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import javax.swing.*;


import Other.Lang;
import Other.PasxRu;

import Other.WindowInfoRu;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.*;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;

public class FuckMainWindowRu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuckMainWindowRu frame = new FuckMainWindowRu();
					frame.setVisible(true);	
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Вся кухня Frame 
	public FuckMainWindowRu() {
		setBackground(Color.BLACK);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 296);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(0, 0));
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
//Расположение JLabel друг на друге.		
		contentPane.setLayout(null);
//Кнопка закрыть. 		
		JLabel close = new JLabel("");
		close.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
			
//Переключатель.
		
		JToggleButton per = new JToggleButton("");
		per.addItemListener(new ItemListener() { 
			public void itemStateChanged (ItemEvent ie) { 
				if(per.isSelected()){ 
					Image img2 = new ImageIcon(this.getClass().getResource("knop2.png")).getImage();
					per.setIcon(new ImageIcon(img2));
					
					new VelWinRu().setVisible(true);	
				}
				else {
					Image img3 = new ImageIcon(this.getClass().getResource("knop.png")).getImage();
					per.setIcon(new ImageIcon(img3));
					
					
					per.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							new VelWin().setVisible(false);
						}
					});
					
				}
				
			} 
				
		}); 
		
		textField = new JTextField("Стоп/Старт");
		textField.setRequestFocusEnabled(false);
		textField.setOpaque(false);
//Убираем рамку.
		textField.setBorder(null);
		textField.setMargin(new Insets(0, 0, 0, 0));
		textField.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField.setFocusTraversalKeysEnabled(false);
		textField.setDisabledTextColor(Color.GRAY);
		textField.setFocusable(false);
		textField.setSelectedTextColor(Color.LIGHT_GRAY);
		textField.setBounds(74, 47, 86, 47);
		contentPane.add(textField);
		textField.setColumns(14);
		
		
		Image img3 = new ImageIcon(this.getClass().getResource("knop.png")).getImage();
		per.setIcon(new ImageIcon(img3));
		per.setBorderPainted(false);
		per.setContentAreaFilled(false);
		per.setFocusPainted(false);
		per.setBounds(21, 60, 48, 22);
		contentPane.add(per);
		close.setBounds(1, 0, 22, 22);
		contentPane.add(close);
		
		

		
//Кнопка настроек.
		JButton nastr = new JButton("");
		nastr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new Lang().setVisible(true);	
				
				
			}
		});
//Убирает заполнение.
		nastr.setBorderPainted(false);
//Убирает рамку.
		nastr.setContentAreaFilled(false);
//Убираем фокус с кнопки.
		nastr.setFocusPainted(false);
		nastr.setBounds(626, 22, 22, 22);
		contentPane.add(nastr);

		
//Кнопка информации.					
		JButton Info = new JButton("");
		Info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//Дейсвия при нажатии на кнопку.	         
	             new WindowInfoRu().setVisible(true);	           
	         }
		});
		Info.setContentAreaFilled(false);
		Info.setBorderPainted(false);
		Info.setFocusPainted(false);
		Info.setBounds(664, 22, 22, 22);
		contentPane.add(Info);
								
//Кнопка свернуть.		
		JLabel svern = new JLabel("");
		svern.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setState(FuckMainWindow.ICONIFIED);
			}
		});
		svern.setBounds(23, 0, 22, 22);
		contentPane.add(svern);
		
//Здесь хранится пасхалка		
		JButton pasxalca = new JButton("");
		pasxalca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new PasxRu().setVisible(true);		
				
			}
		});
		pasxalca.setBounds(47, 1, 22, 22);
		pasxalca.setBorderPainted(false);
		pasxalca.setContentAreaFilled(false);
		pasxalca.setFocusPainted(false);
		contentPane.add(pasxalca);
		
		
//Как выглядит главное окно.		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("fon1.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(1, 1, 694, 294);

		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.add(lblNewLabel);
		
	}
}
