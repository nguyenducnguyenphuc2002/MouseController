package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.MouseEventView;

public class MouseEventController implements MouseListener,MouseMotionListener{
	private MouseEventView mouseEventView;

	public MouseEventController(MouseEventView mouseEventView) {
		super();
		this.mouseEventView = mouseEventView;
	}



	@Override
	public void mouseClicked(MouseEvent e) {
			this.mouseEventView.Click();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
			this.mouseEventView.enter();
	}

	@Override
	public void mouseExited(MouseEvent e) {
			this.mouseEventView.exist();
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.mouseEventView.update(x, y);		
	}
	
	
}
