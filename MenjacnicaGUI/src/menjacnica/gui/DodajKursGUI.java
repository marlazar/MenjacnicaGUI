package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.parser.ParserDelegator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel eastPanel;
	private JPanel westPanel;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JLabel lblNewLabel;
	private JTextField textFieldPKurs;
	private JLabel lblNewLabel_1;
	private JTextField textFieldSKurs;
	private JButton btnDodaj;
	private JLabel label;
	private JLabel lblNaziv;
	private JLabel lblKupovniKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldNaziv;
	private JTextField textFieldKKurs;
	private JTextField textFieldSkrNaziv;
	private JButton btnOdustani;

	private MenjacnicaGUI gui;
	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI gui) {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		setLocationRelativeTo(gui);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getWestPanel(), BorderLayout.WEST);
		this.gui=gui;
	}

	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(190, 0));
			eastPanel.setLayout(null);
			eastPanel.add(getLabel());
			eastPanel.add(getLblNaziv());
			eastPanel.add(getLblKupovniKurs());
			eastPanel.add(getLblSkraceniNaziv());
			eastPanel.add(getTextFieldNaziv());
			eastPanel.add(getTextField_1());
			eastPanel.add(getTextField_2());
			eastPanel.add(getBtnOdustani());
		}
		return eastPanel;
	}

	private JPanel getWestPanel() {
		if (westPanel == null) {
			westPanel = new JPanel();
			westPanel.setPreferredSize(new Dimension(190, 0));
			westPanel.setLayout(null);
			westPanel.add(getLblSifra());
			westPanel.add(getTextFieldSifra());
			westPanel.add(getLblNewLabel());
			westPanel.add(getTextFieldPKurs());
			westPanel.add(getLblNewLabel_1());
			westPanel.add(getTextFieldSKurs());
			westPanel.add(getBtnDodaj());
		}
		return westPanel;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(0, 27, 114, 15);
		}
		return lblSifra;
	}

	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(0, 48, 188, 19);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Prodajni kurs");
			lblNewLabel.setBounds(0, 89, 114, 15);
		}
		return lblNewLabel;
	}

	private JTextField getTextFieldPKurs() {
		if (textFieldPKurs == null) {
			textFieldPKurs = new JTextField();
			textFieldPKurs.setBounds(0, 116, 188, 19);
			textFieldPKurs.setColumns(10);
		}
		return textFieldPKurs;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Srednji kurs");
			lblNewLabel_1.setBounds(0, 156, 188, 15);
		}
		return lblNewLabel_1;
	}

	private JTextField getTextFieldSKurs() {
		if (textFieldSKurs == null) {
			textFieldSKurs = new JTextField();

			textFieldSKurs.setBounds(0, 183, 188, 19);
			textFieldSKurs.setColumns(10);
		}
		return textFieldSKurs;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String kurs = "Sifra: " + textFieldSifra.getText() + ", naziv: " + textFieldNaziv.getText()
							+ ", skraceni naziv: " + textFieldSkrNaziv.getText() + ", prodajni kurs: "
							+ textFieldPKurs.getText() + ", srednji kurs: " + textFieldSKurs.getText()
							+ ", kupovni kurs: " + textFieldKKurs.getText();
					gui.ispisiUStatusu(kurs);
					dispose();
				}				
			});
			btnDodaj.setBounds(0, 236, 188, 25);
		}
		return btnDodaj;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(43, 236, 0, 0);
		}
		return label;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(0, 28, 70, 15);
		}
		return lblNaziv;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(0, 89, 178, 15);
		}
		return lblKupovniKurs;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(0, 157, 178, 15);
		}
		return lblSkraceniNaziv;
	}

	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(0, 47, 190, 19);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}

	private JTextField getTextField_1() {
		if (textFieldKKurs == null) {
			textFieldKKurs = new JTextField();
			textFieldKKurs.setBounds(0, 116, 190, 19);
			textFieldKKurs.setColumns(10);
		}
		return textFieldKKurs;
	}

	private JTextField getTextField_2() {
		if (textFieldSkrNaziv == null) {
			textFieldSkrNaziv = new JTextField();
			textFieldSkrNaziv.setText("");
			textFieldSkrNaziv.setBounds(0, 184, 190, 19);
			textFieldSkrNaziv.setColumns(10);
		}
		return textFieldSkrNaziv;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(0, 236, 190, 25);
		}
		return btnOdustani;
	}
}
