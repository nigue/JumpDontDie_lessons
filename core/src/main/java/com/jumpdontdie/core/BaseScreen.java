package com.jumpdontdie.core;

import com.badlogic.gdx.Screen;

public abstract class BaseScreen implements Screen {

    protected MainGame mainGame;

    public BaseScreen(MainGame mainGame) {
        this.mainGame = mainGame;
    }

    @Override
    public void render(float f) {
    }

    @Override
    public void resize(int i, int i1) {
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }

}
