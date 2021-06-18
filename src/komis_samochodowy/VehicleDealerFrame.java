package komis_samochodowy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Label;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VehicleDealerFrame {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtPodajMark;
	private JTextField txtPodajModel;
	private JTextField txtPodajKolor;
	private JTextField txtPodajCene;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VehicleDealerFrame window = new VehicleDealerFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VehicleDealerFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Komis");
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Zakup pojazdu", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Samochody");
		buttonGroup.add(rdbtnNewRadioButton);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 3;
		gbc_rdbtnNewRadioButton.gridy = 0;
		panel.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Motocykle");
		buttonGroup.add(rdbtnNewRadioButton_1);
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 4;
		gbc_rdbtnNewRadioButton_1.gridy = 0;
		panel.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Dost\u0119pne pojazdy");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 3;
		gbc_list.gridy = 2;
		panel.add(list, gbc_list);
		
		JButton btnNewButton = new JButton("Kup");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 4;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Dodaj pojazd", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Samoch\u00F3d");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 2;
		gbc_rdbtnNewRadioButton_2.gridy = 0;
		panel_1.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Motocykl");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		GridBagConstraints gbc_rdbtnNewRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_3.gridx = 4;
		gbc_rdbtnNewRadioButton_3.gridy = 0;
		panel_1.add(rdbtnNewRadioButton_3, gbc_rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Marka");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 1;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtPodajMark = new JTextField();
		txtPodajMark.setToolTipText("");
		GridBagConstraints gbc_txtPodajMark = new GridBagConstraints();
		gbc_txtPodajMark.gridwidth = 3;
		gbc_txtPodajMark.insets = new Insets(0, 0, 5, 5);
		gbc_txtPodajMark.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPodajMark.gridx = 2;
		gbc_txtPodajMark.gridy = 2;
		panel_1.add(txtPodajMark, gbc_txtPodajMark);
		txtPodajMark.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Model");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 3;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtPodajModel = new JTextField();
		txtPodajModel.setToolTipText("");
		GridBagConstraints gbc_txtPodajModel = new GridBagConstraints();
		gbc_txtPodajModel.gridwidth = 3;
		gbc_txtPodajModel.insets = new Insets(0, 0, 5, 5);
		gbc_txtPodajModel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPodajModel.gridx = 2;
		gbc_txtPodajModel.gridy = 4;
		panel_1.add(txtPodajModel, gbc_txtPodajModel);
		txtPodajModel.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Kolor");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 5;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtPodajKolor = new JTextField();
		txtPodajKolor.setToolTipText("");
		GridBagConstraints gbc_txtPodajKolor = new GridBagConstraints();
		gbc_txtPodajKolor.gridwidth = 3;
		gbc_txtPodajKolor.insets = new Insets(0, 0, 5, 5);
		gbc_txtPodajKolor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPodajKolor.gridx = 2;
		gbc_txtPodajKolor.gridy = 6;
		panel_1.add(txtPodajKolor, gbc_txtPodajKolor);
		txtPodajKolor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cena");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 3;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 7;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtPodajCene = new JTextField();
		GridBagConstraints gbc_txtPodajCene = new GridBagConstraints();
		gbc_txtPodajCene.gridwidth = 3;
		gbc_txtPodajCene.insets = new Insets(0, 0, 5, 5);
		gbc_txtPodajCene.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPodajCene.gridx = 2;
		gbc_txtPodajCene.gridy = 8;
		panel_1.add(txtPodajCene, gbc_txtPodajCene);
		txtPodajCene.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Dodaj pojazd");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(rdbtnNewRadioButton_2.isSelected()) {
						System.out.println("Samochód zaznaczony");
					}
					
					if(rdbtnNewRadioButton_3.isSelected()) {
						System.out.println("Motocykl zaznaczony");
					}
					
					System.out.println(txtPodajMark.getText());
					System.out.println(txtPodajModel.getText());
					System.out.println(txtPodajKolor.getText());
					System.out.println(Float.parseFloat(txtPodajCene.getText()));
					
				} catch(NumberFormatException err) {
					System.out.println("Pole cena musi zawieraæ liczbê.");
				}
				
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 10;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
	}

}
