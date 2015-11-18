package com.jumpdontdie.core;

import com.badlogic.gdx.InputAdapter;

public class Procesador extends InputAdapter {

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        System.out.println("has tocado en la posicion " + screenX + "," + screenY);
        System.out.println("has usado el dedo " + pointer + " y el boton " + button);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

}
