package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

	public class GridBagJPanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * Create the panel.
		 */
		public GridBagJPanel() {
			JButton a, b;
			setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.anchor = GridBagConstraints.FIRST_LINE_START;

			a = new JButton("button");
			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.weightx = 0;
			gbc.weighty = 1;
			add(a, gbc);
			
			b = new JButton("button1");
			gbc.gridx = 1;
			gbc.gridy = 1;
			add(b, gbc);
		}

}
