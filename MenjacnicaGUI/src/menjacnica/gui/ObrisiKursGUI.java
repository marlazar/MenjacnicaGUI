package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel westPanel;
	private JPanel eastPanel;
	private JLabel lblSifra;
	private JLabel lblProdajniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblNaziv;
	private JLabel lblKupovniKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField txtSifra;
	private JTextField txtProdajniKurs;
	private JTextField txtSrednjiKurs;
	private JTextField txtNaziv;
	private JTextField txtKupovniKurs;
	private JTextField txtSkrNaziv;
	private JButton btnOdustani;
	private JButton btnObrisi;
	private JCheckBox chckbxZaistaObrisiKurs;
	private MenjacnicaGUI gui;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI gui) {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		setLocationRelativeTo(gui);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getWestPanel(), BorderLayout.WEST);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		this.gui = gui;
	}

	private JPanel getWestPanel() {
		if (westPanel == null) {
			westPanel = new JPanel();
			westPanel.setPreferredSize(new Dimension(190, 0));
			westPanel.setLayout(null);
			westPanel.add(getLblSifra());
			westPanel.add(getLblProdajniKurs());
			westPanel.add(getLblSrednjiKurs());
			westPanel.add(getTxtSifra());
			westPanel.add(getTxtProdajniKurs());
			westPanel.add(getTxtSrednjiKurs());
			westPanel.add(getBtnObrisi());
			westPanel.add(getChckbxZaistaObrisiKurs());
		}
		return westPanel;
	}

	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(190, 0));
			eastPanel.setLayout(null);
			eastPanel.add(getLblNaziv());
			eastPanel.add(getLblKupovniKurs());
			eastPanel.add(getLblSkraceniNaziv());
			eastPanel.add(getTxtNaziv());
			eastPanel.add(getTxtKupovniKurs());
			eastPanel.add(getTxtSkrNaziv());
			eastPanel.add(getBtnOdustani());
		}
		return eastPanel;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(12, 25, 70, 15);
		}
		return lblSifra;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(12, 78, 166, 15);
		}
		return lblProdajniKurs;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(12, 144, 166, 15);
		}
		return lblSrednjiKurs;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(12, 25, 70, 15);
		}
		return lblNaziv;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(12, 78, 166, 15);
		}
		return lblKupovniKurs;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(12, 144, 140, 15);
		}
		return lblSkraceniNaziv;
	}

	private JTextField getTxtSifra() {
		if (txtSifra == null) {
			txtSifra = new JTextField();
			txtSifra.setBounds(12, 47, 166, 19);
			txtSifra.setColumns(10);
		}
		return txtSifra;
	}

	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setBounds(12, 106, 166, 19);
			txtProdajniKurs.setColumns(10);
		}
		return txtProdajniKurs;
	}

	private JTextField getTxtSrednjiKurs() {
		if (txtSrednjiKurs == null) {
			txtSrednjiKurs = new JTextField();
			txtSrednjiKurs.setBounds(12, 171, 166, 19);
			txtSrednjiKurs.setColumns(10);
		}
		return txtSrednjiKurs;
	}

	private JTextField getTxtNaziv() {
		if (txtNaziv == null) {
			txtNaziv = new JTextField();
			txtNaziv.setBounds(12, 47, 178, 19);
			txtNaziv.setColumns(10);
		}
		return txtNaziv;
	}

	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setBounds(12, 106, 178, 19);
			txtKupovniKurs.setColumns(10);
		}
		return txtKupovniKurs;
	}

	private JTextField getTxtSkrNaziv() {
		if (txtSkrNaziv == null) {
			txtSkrNaziv = new JTextField();
			txtSkrNaziv.setBounds(12, 171, 178, 19);
			txtSkrNaziv.setColumns(10);
		}
		return txtSkrNaziv;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(30, 236, 117, 25);
		}
		return btnOdustani;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String kurs = "Sifra: " + txtSifra.getText() + ", naziv: " + txtNaziv.getText()
							+ ", skraceni naziv: " + txtSkrNaziv.getText() + ", prodajni kurs: "
							+ txtProdajniKurs.getText() + ", srednji kurs: " + txtSrednjiKurs.getText()
							+ ", kupovni kurs: " + txtKupovniKurs.getText();
					gui.ispisiUStatusu(kurs);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(45, 236, 117, 25);
		}
		return btnObrisi;
	}

	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (chckbxZaistaObrisiKurs.isSelected()) {
						btnObrisi.setEnabled(true);
					} else
						btnObrisi.setEnabled(false);
				}
			});
			chckbxZaistaObrisiKurs.setBounds(12, 209, 166, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
}
