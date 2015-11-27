package biscuitbaker.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import biscuitbaker.game.BiscuitBaker;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Biscuit Baker";
		new LwjglApplication(new BiscuitBaker(), config);
	}
}
