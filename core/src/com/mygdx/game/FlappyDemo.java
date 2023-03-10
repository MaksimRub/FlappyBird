package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.States.GameStateMananger;
import com.mygdx.game.States.MenuState;

public class FlappyDemo extends ApplicationAdapter {
	private SpriteBatch batch;

	public static final int Height=800;


	public static final int Width= 480;
	private GameStateMananger gsm;

	@Override
	public void create () {
		batch = new SpriteBatch();
		ScreenUtils.clear(1, 0, 0, 1);
		 gsm = new GameStateMananger();
		 gsm.push(new MenuState(gsm));
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		gsm.resize(width, height);
	}

	@Override
	public void render () {

		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
