package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseEventController;
import model.MouseEventModel;

public class MouseEventView extends JFrame{
	private MouseEventModel mouseEventModel;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_count_value;
	private JLabel jLabel_count;
	private JLabel jLabel_empty_1;
	private JLabel jLabel_check_in;
	private JLabel jLabel_check_in_value;
	private JLabel jLabel_empty_2;

	public MouseEventView(MouseEventModel mouseEventModel) throws HeadlessException {
		this.mouseEventModel = mouseEventModel;
		this.init();
	}

	private void init() {
		this.setTitle("Mouse Example");	
		this.setSize(1200, 600);
		this.setLocationRelativeTo(null);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.ITALIC, 40);

		
		MouseEventController mouseEventController = new MouseEventController(this);
		
		JPanel jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.cyan);
		jPanel_mouse.addMouseListener(mouseEventController);
		jPanel_mouse.addMouseMotionListener(mouseEventController);
		
		JPanel jPanel_info = new JPanel();
		jPanel_info.setLayout(new GridLayout(3,3));
		
		
		JLabel jLabel_position = new JLabel("Position: ");
		jLabel_position.setFont(font);
		jLabel_x = new JLabel("x = ");
		jLabel_x.setFont(font);
		jLabel_y = new JLabel("y = ");
		jLabel_y.setFont(font);
		jLabel_count = new JLabel("Number of clicks: ");
		jLabel_count.setFont(font);
		jLabel_count_value = new JLabel();
		jLabel_count_value.setFont(font);
		jLabel_empty_1 = new JLabel();
		jLabel_check_in = new JLabel("Mouse is component: ");
		jLabel_check_in.setFont(font);
		jLabel_check_in_value = new JLabel("no");
		jLabel_check_in_value.setFont(font);
		jLabel_empty_2 = new JLabel();
		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);
		jPanel_info.add(jLabel_count);
		jPanel_info.add(jLabel_count_value);
		jPanel_info.add(jLabel_empty_1);
		jPanel_info.add(jLabel_check_in);
		jPanel_info.add(jLabel_check_in_value);
		jPanel_info.add(jLabel_empty_2);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_mouse,BorderLayout.CENTER);
		this.add(jPanel_info,BorderLayout.SOUTH);
				
				
		this.setVisible(true);
	}
	
	public void Click() {
		this.mouseEventModel.addClick();
		this.jLabel_count_value.setText(this.mouseEventModel.getCount()+"");
	}
	public void enter() {
		this.mouseEventModel.enter();
		this.jLabel_check_in_value.setText(this.mouseEventModel.getCheckIN());
	}
	
	public void exist() {
		this.mouseEventModel.exist();
		this.jLabel_check_in_value.setText(this.mouseEventModel.getCheckIN());

	}
	
	public void update(int x, int y) {
		this.mouseEventModel.setX(x);
		this.mouseEventModel.setY(y);
		this.jLabel_x.setText(this.mouseEventModel.getX()+"");
		this.jLabel_y.setText(this.mouseEventModel.getY()+"");
	}
}
