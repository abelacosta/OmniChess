package com.blu3flux.omnichess.graphics.window;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.blu3flux.omnichess.graphics.theme.ThemeManager;

public class MoveList extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JScrollPane scrollPane; 
	private JTable table;

	public MoveList() {
		table = new JTable();
		table.setEnabled(false);
		table.setRowHeight(30);
		table.setForeground(ThemeManager.getInstance().getFontColor());
		table.setBackground(ThemeManager.getInstance().getPrimaryColor());
		
		scrollPane = new JScrollPane(table);
		add(scrollPane);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(ThemeManager.getInstance().getSecondaryColor());
		g.fillRect(0, 0, getWidth(), getHeight());
	}
	
	public void setSize(Dimension d) {
		scrollPane.setPreferredSize(d);
		setPreferredSize(d);
	}
}
