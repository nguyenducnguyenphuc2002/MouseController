package test;

import model.MouseEventModel;
import view.MouseEventView;

public class Test {
	public static void main(String[] args) {
		new MouseEventView(new MouseEventModel());
	}
}
