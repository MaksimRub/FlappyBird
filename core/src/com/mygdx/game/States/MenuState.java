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
    protected void handleInput() {
        if (Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
        }

    }

    @Override
    public void update(float dl) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {

        sb.begin();
        sb.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        sb.draw(playBtn,(float) Gdx.graphics.getWidth()/2-(float) 50,
                (float) Gdx.graphics.getHeight()/2-(float) 50,
                100, 100);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }


}
