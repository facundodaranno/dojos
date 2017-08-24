package com.mercadolibre.dojos;

/**
 * Created by fdaranno on 10/8/17.
 */
public class Wall implements Ocupant{
    public Boolean visitBy(Bomberman bomberman) {
        return bomberman.colliteWith(this);
    }
}
