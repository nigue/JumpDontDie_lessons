package com.jumpdontdie.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
//import com.badlogic.gdx.physics.box2d.World;

public class Box2DScreen extends BaseScreen {

    public Box2DScreen(MainGame mainGame) {
        super(mainGame);
    }

//    private World world;
    
    @Override
    public void show() {
//        world = new World(new Vector2(0, -10), true);
    }

    @Override
    public void dispose() {
//        world.dispose();
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        world.step(f, 6, 2);
    }

}
