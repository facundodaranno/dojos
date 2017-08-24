package com.mercadolibre.dojos;

/**
 * Created by fdaranno on 10/8/17.
 */
public class Cell {

    private Ocupant ocupant;

    public Cell( Ocupant ocupant){
        this.ocupant = ocupant;
    }

    public Cell() {
        this.ocupant = new Nothing();
    }

    public boolean reclamedBy( Bomberman bomberman) {
        return this.ocupant.visitBy(bomberman);
    }
}
