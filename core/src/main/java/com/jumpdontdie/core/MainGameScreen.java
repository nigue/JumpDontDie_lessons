package com.jumpdontdie.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.jumpdontdie.core.actors.ActorJugador;
import com.jumpdontdie.core.actors.ActorPinchos;

public class MainGameScreen extends BaseScreen {

    public MainGameScreen(MainGame mainGame) {
        super(mainGame);
        textureJugador = new Texture("hatenac.png");
        texturePinchos = new Texture("pinchos.png");
        regionPinchos = new TextureRegion(texturePinchos, 0, 64, 128, 64);
    }

    private Stage stage;
    private ActorJugador jugador;
    private ActorPinchos pinchos;

    private Texture textureJugador;
    private Texture texturePinchos;
    private TextureRegion regionPinchos;

    @Override
    public void show() {

        stage = new Stage();

        stage.setDebugAll(false);

        jugador = new ActorJugador(textureJugador);
        pinchos = new ActorPinchos(regionPinchos);

        stage.addActor(jugador);
        stage.addActor(pinchos);

        jugador.setPosition(20, 100);
        pinchos.setPosition(500, 100);

    }

    @Override
    public void hide() {
        stage.dispose();
        textureJugador.dispose();
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClearColor(.4f, .5f, .8f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        comprobarColisiones();
        stage.draw();
    }

    private void comprobarColisiones() {
        if (jugador.isAlive() && (jugador.getX() + jugador.getWidth()) > pinchos.getX()) {
            System.out.println("Colision");
            jugador.setAlive(false);
        }
    }

}
