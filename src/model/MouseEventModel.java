package model;

public class MouseEventModel {
	private int x,y;
	private int count;
	private String checkIN;
	
	public MouseEventModel() {
		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCheckIN() {
		return checkIN;
	}
	public void setCheckIN(String checkIN) {
		this.checkIN = checkIN;
	}
	
	public void addClick() {
		this.count++;
	}
	public void enter() {
		this.checkIN = "YES";
	}
	
	public void exist() {
		this.checkIN = "NO";
	}
}
