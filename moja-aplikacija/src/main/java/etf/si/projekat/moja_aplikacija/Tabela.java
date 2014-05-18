package etf.si.projekat.moja_aplikacija;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class Tabela {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabela window = new Tabela();
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
	public Tabela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{1, null, null, null, null, null},
				{2, null, null, null, null, null},
				{3, null, null, null, null, null},
				{4, null, null, null, null, null},
				{5, null, null, null, null, null},
			},
			new String[] {
				"ID", "COMMAND", "ISGRANTED", "TIMESTAMP", "USER", "FIXTURENAME"
			}
		));

		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(20, 51, 275, 167);
		frame.getContentPane().add(table);
	}
}
