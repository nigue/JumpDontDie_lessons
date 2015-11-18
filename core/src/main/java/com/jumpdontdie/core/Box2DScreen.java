package com.jumpdontdie.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class Box2DScreen extends BaseScreen {

    public Box2DScreen(MainGame mainGame) {
        super(mainGame);
    }

    @Override
    public void show() {
    }

    @Override
    public void dispose() {
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

}
