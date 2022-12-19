package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.FlappyDemo;

public abstract class State {
    protected OrthographicCamera camera;
    protected Vector3 mouse;
    protected GameStateMananger gsm;
    public State(GameStateMananger gsm){
        this.gsm=gsm;
        mouse=new Vector3();
        camera=new OrthographicCamera();

    }
    protected abstract void handleScreen();
    public abstract void update(float dl);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();

    }


