package memento;

import memento.players.Circle;
import memento.players.Cross;
import memento.players.Matrix;

import java.util.NoSuchElementException;

public class Turn {
    private Integer positionX;
    private Integer positionY;
    private String player;

    private Memento undo;

    private class Memento {
        Integer turnPositionX;
        Integer turnPositionY;
        String turnPlayer;

        public Memento() {
            this.turnPositionX = positionX;
            this.turnPositionY = positionY;
            this.turnPlayer = player;
        }

        public Integer getTurnPositionX() {
            return turnPositionX;
        }

        public Integer getTurnPositionY() {
            return turnPositionY;
        }

        public String getTurnPlayer() {
            return turnPlayer;
        }
    }

    public void preview() {
        undo = new Memento();
    }

    public void undoTurn() {
        positionX = undo.getTurnPositionX();
        positionY = undo.getTurnPositionY();
        player = undo.getTurnPlayer();
        Matrix.putZero(positionX,positionY);
    }

    public void doTurn(){
        switch (getPlayer().toUpperCase()){
            case "CROSS": new Cross().doTurn(getPositionX(), getPositionY()); break;
            case "CIRCLE": new Circle().doTurn(getPositionX(), getPositionY()); break;
            default: throw new NoSuchElementException("No such player");
        }
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public String getPlayer() {
        return player;
    }
}
