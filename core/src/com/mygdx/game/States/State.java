package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.FlappyDemo;

public abstract class State {
    protected OrthographicCamera camera;
    protected Vector3 mouse;
    protected GameStateMananger gsm;
    Viewport viewport;
    public State(GameStateMananger gsm){
        this.gsm=gsm;
        mouse=new Vector3();
        camera=new OrthographicCamera();
        viewport=new FillViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight(),camera);

    }
    protected abstract void handleInput();
    public abstract void update(float dl);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
    public abstract void resize(int width, int height);

    }


