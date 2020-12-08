package com.java.app.state;

/**
 * The parent state class
 */
public abstract class State {
    
    // The State is aware of the context
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
