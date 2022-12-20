package com.mygdx.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateMananger {
    private Stack<State> states;

    public GameStateMananger(){
        states=new Stack<>();
    }
    public void push(State state){
        states.push(state);
    }
    public void pop(){
        states.pop().dispose();
    }
    public void set(State state){
        states.pop().dispose();
        states.push(state);
    }
    public  void update(float dl){
        states.peek().update(dl);
    }public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
    public void resize(int width, int height){
        states.peek().resize(width, height);
    }

}
