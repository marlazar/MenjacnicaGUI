package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenjacnicaGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel southPanel;
	private JPanel eastPanel;
	private JPanel centerPanel;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamenu;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPaneFooter;
	private JTextArea textAreaStatus;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;
	private MenjacnicaGUI gui =this;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlaz();
			}
		});
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getSouthPanel(), BorderLayout.SOUTH);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getCenterPanel(), BorderLayout.CENTER);
	}

	private JPanel getSouthPanel() {
		if (southPanel == null) {
			southPanel = new JPanel();
			southPanel.setPreferredSize(new Dimension(0, 60));
			southPanel.setLayout(new BorderLayout(0, 0));
			southPanel.add(getScrollPaneFooter(), BorderLayout.CENTER);
		}
		return southPanel;
	}

	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setBounds(new Rectangle(20, 0, 0, 100));
			eastPanel.setPreferredSize(new Dimension(150, 0));
			eastPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			eastPanel.add(getBtnDodajKurs());
			eastPanel.add(getBtnObrisiKurs());
			eastPanel.add(getBtnIzvrsiZamenu());
		}
		return eastPanel;
	}

	private JPanel getCenterPanel() {
		if (centerPanel == null) {
			centerPanel = new JPanel();
			centerPanel.setLayout(new BorderLayout(0, 0));
			centerPanel.add(getScrollPane());
		}
		return centerPanel;
	}

	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.setPreferredSize(new Dimension(131, 25));
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					DodajKursGUI dodajKurs = new DodajKursGUI(gui);
					dodajKurs.setVisible(true);
				}
			});
		}
		return btnDodajKurs;
	}

	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
			btnObrisiKurs.setPreferredSize(new Dimension(131, 25));
			btnObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ObrisiKursGUI obrisiKurs = new ObrisiKursGUI(gui);
					obrisiKurs.setVisible(true);
				}
			});
		}
		return btnObrisiKurs;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		}
		return btnIzvrsiZamenu;
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}

	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}

	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					otvori();

				}
			});
			mntmOpen.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}

	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sacuvaj();

				}
			});
			mntmSave.setIcon(
					new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}

	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					izlaz();
				}

			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}

	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}

	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Aplikacija interfejsa menjacnice \nAutor: Markovic Lazar 122/2016",
							"O programu", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAbout;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBackground(Color.WHITE);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
					new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
					new String[] { "Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" }));
			addPopup(table, getPopupMenu());
		}
		return table;
	}

	private JScrollPane getScrollPaneFooter() {
		if (scrollPaneFooter == null) {
			scrollPaneFooter = new JScrollPane();
			scrollPaneFooter.setViewportBorder(
					new TitledBorder(null, "STATUS", TitledBorder.LEFT, TitledBorder.TOP, null, null));
			scrollPaneFooter.setViewportView(getTextAreaStatus());
		}
		return scrollPaneFooter;
	}

	private JTextArea getTextAreaStatus() {
		if (textAreaStatus == null) {
			textAreaStatus = new JTextArea();
		}
		return textAreaStatus;
	}

	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					DodajKursGUI dodajKurs = new DodajKursGUI(gui);
					dodajKurs.setVisible(true);
				}
			});
		}
		return mntmDodajKurs;
	}

	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");	
			mntmObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ObrisiKursGUI obrisiKurs = new ObrisiKursGUI(gui);
					obrisiKurs.setVisible(true);
				}
			});
		}
		return mntmObrisiKurs;
	}

	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
		}
		return mntmIzvrsiZamenu;
	}
	
	private void izlaz() {
		int opcija = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite da izadjete?", "Izlaz",
				JOptionPane.YES_NO_CANCEL_OPTION);
		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);

	}

	private void sacuvaj() {
		JFileChooser jc = new JFileChooser();
		int retVal = jc.showSaveDialog(contentPane);
		if (retVal == JFileChooser.APPROVE_OPTION) {
			File f = jc.getSelectedFile();
			textAreaStatus.append("\nSacuvan fajl: " + f);
		}
	}

	private void otvori() {
		JFileChooser jc = new JFileChooser();
		int retVal = jc.showOpenDialog(contentPane);
		if (retVal == JFileChooser.APPROVE_OPTION) {
			File f = jc.getSelectedFile();
			textAreaStatus.append("\nUcitan fajl: " + f);
		}
	}
	void ispisiUStatusu(String s) {
		textAreaStatus.append("\n"+s);
	}

	
}
