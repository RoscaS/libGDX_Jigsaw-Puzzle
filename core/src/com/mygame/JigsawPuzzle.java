package com.mygame;

import com.framework.BaseGame;
import com.mygame.screens.MainMenuScreen;

public class JigsawPuzzle extends BaseGame {

	public void create() {
		super.create();
	    setActiveScreen(new MainMenuScreen());
    }
}
