package com.mercadolibre.dojos;


/**
 * Created by fdaranno on 10/8/17.
 */
public class Bomberman {

    private Cell posicion;
    private BombermanStatus bombermanStatus;

    public Bomberman(Cell bornPlace) {
        this.bombermanStatus = BombermanStatus.ALIVE;
        this.posicion = bornPlace;
    }

    public Bomberman() {

    }

    public void stepInto(Cell cell) {
        cell.reclamedBy( this );
        this.posicion = cell;
    }

    public boolean isIn(Cell cell) {
        return true;
    }

    public boolean idDead() {
        return this.bombermanStatus.equals( BombermanStatus.DEAD );
    }

    public boolean colliteWith(Ocupant ocupant) {
        return true;
    }

    public boolean colliteWith(Bolban ocupant) {
        this.bombermanStatus = BombermanStatus.DEAD;
        return false;
    }

    public boolean colliteWith(Wall ocupant) {
        throw new IllegalStateException();
    }

}
