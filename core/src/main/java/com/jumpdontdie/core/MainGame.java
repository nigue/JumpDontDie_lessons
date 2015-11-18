package com.jumpdontdie.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MainGame extends ApplicationAdapter {

//    private Texture minijoe;
//    private Texture pinchos;
//    private SpriteBatch spriteBatch;
//    private TextureRegion textureRegionPinchos;
//    private int width;
//    private int height;
//    private int widthJoe;
//    private int heightJoe;

    @Override
    public void create() {
//        minijoe = new Texture("hatenac.png");
//        pinchos = new Texture("pinchos.png");
//        textureRegionPinchos = new TextureRegion(pinchos, 0, 60, 128, 60);
//        spriteBatch = new SpriteBatch();
//        width = Gdx.graphics.getWidth();
//        height = Gdx.graphics.getHeight();
//        widthJoe = minijoe.getWidth();
//        heightJoe = minijoe.getHeight();
//        System.out.println("pantalla: " + Gdx.graphics.getWidth() + "x" + Gdx.graphics.getHeight());
        Procesador p = new Procesador();
        Gdx.input.setInputProcessor(p);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(.3f, .3f, .3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        spriteBatch.begin();
//        spriteBatch.draw(minijoe, 160, 80);
//        spriteBatch.draw(textureRegionPinchos, 200, 0);
//        spriteBatch.end();
    }

    @Override
    public void dispose() {
//        minijoe.dispose();
//        pinchos.dispose();
//        spriteBatch.dispose();
    }

}
