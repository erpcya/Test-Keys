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
package org.spin.test;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Test Class from Java
 * @author Yamel Senih, ysenih@erpya.com , http://www.erpya.com
 *
 */
public class TestKey {
	
	public static void main(String[] args) {
		JFrame form = new JFrame("Test a Keys");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//	Text Field
		JTextField testField = new JTextField(50);
		JTextArea resultField = new JTextArea(10, 10);
		resultField.setLineWrap(true);
		resultField.setWrapStyleWord(true);
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
		
		Container panel = form.getContentPane();
		panel.add(testField, BorderLayout.PAGE_START);
		panel.add(clear, BorderLayout.PAGE_END);
		panel.add(new JScrollPane(resultField), BorderLayout.CENTER);
		form.pack();
		form.setLocationRelativeTo(null);
		form.setVisible(true);
	}
}
