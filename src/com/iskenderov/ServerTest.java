package com.iskenderov;

import javax.swing.JFrame;

import com.iskenderov.server.Server;

public class ServerTest {

	public static void main(String[] args) {

		Server sally = new Server();
		sally.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sally.startRunning();

	}

}
