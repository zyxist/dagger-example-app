package com.zyxist.example.dagger.app;

/**
 * Here's the main method. It shows, how to launch our app.
 */
public class Application {

	public static void main(String args[]) {
		DaggerApplicationComponent.create()
			.bootstrap()
			.execute();
	}
}
