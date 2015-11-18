package com.jumpdontdie.html;

import com.jumpdontdie.core.MainGame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class MainGameHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new MainGame();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
