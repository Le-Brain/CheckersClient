import javax.swing.*;
import View.BoardPanel;

import java.awt.*;

public class ClientMain {
	
	public static void main(String[] args) {
		ClientApp client = new ClientApp();
		client.setTitle("Checkers");
		client.setSize(800,500);
		client.pack();
		client.setVisible(true);
		client.setLocation(250, 150);
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
