package com.framework.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.mygame.JigsawPuzzle;

public class DesktopLauncher {
	public static void main (String[] arg) {

		Game myGame = new JigsawPuzzle();
		LwjglApplication launcher = new LwjglApplication(myGame, "Jigsaw Puzzle", 800, 600);
	}
}
