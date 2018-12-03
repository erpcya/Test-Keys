import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*************************************************************************************
 * Product: Test Keys                                                                *
 * This program is free software; you can redistribute it and/or modify it    		 *
 * under the terms version 2 or later of the GNU General Public License as published *
 * by the Free Software Foundation. This program is distributed in the hope   		 *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied 		 *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           		 *
 * See the GNU General Public License for more details.                       		 *
 * You should have received a copy of the GNU General Public License along    		 *
 * with this program; if not, write to the Free Software Foundation, Inc.,    		 *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     		 *
 * For the text or an alternative of this public license, you may reach us    		 *
 * Copyright (C) 2012-2018 E.R.P. Consultores y Asociados, S.A. All Rights Reserved. *
 * Contributor(s): Yamel Senih www.erpya.com				  		                 *
 *************************************************************************************/

/**
 * Test Class from Java
 * @author yamel
 *
 */
public class TestKey {
	
	public static void main(String[] args) {
		JFrame form = new JFrame("Test a Keys");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//	Text Field
		JTextField testField = new JTextField(50);
		JTextField resultField = new JTextField(50);
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				testField.setText("");
				resultField.setText("");
				testField.requestFocus();
			}
		});
		testField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char charValue = e.getKeyChar();
				resultField.setText(resultField.getText() + "|" + ((int) charValue));
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		resultField.setEnabled(false);
		JPanel panel = new JPanel();
		panel.add(testField);
		panel.add(resultField);
		panel.add(clear);
		form.add(panel);
		form.pack();
		form.setLocationRelativeTo(null);
		form.setVisible(true);
	}
}
