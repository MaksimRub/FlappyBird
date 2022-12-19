package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyDemo;

public class MenuState extends State {
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateMananger gsm) {
        super(gsm);
        playBtn=new Texture("playbtn.jpg");
        background=new Texture("bg.jpg");

    }

    @Override
    protected void handleScreen() {

    }

    @Override
    public void update(float dl) {

    }

    @Override
    public void render(SpriteBatch sb) {

        sb.begin();
        sb.draw(background,0,0,FlappyDemo.Width,FlappyDemo.Height);
        sb.draw(playBtn,0,0);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();

    }


}
