package com.mercadolibre.dojos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the dojo.
 */
public class DojoTest {
	
	@Before
	public void setup() {
	}
	
	@Test
	public void steps_into_a_cell_which_is_empty_then_it_moves_in(){
			Bomberman bomberman = new Bomberman();
			Cell cell = new Cell();

			bomberman.stepInto(cell);
			assertEquals( bomberman.isIn(cell) , true );
	}

	@Test( expected = IllegalStateException.class )
	public void steps_into_a_cell_which_is_busy_with_an_object_then_it_doesnt_move_and_throw_an_exception(){

		Cell cell = new Cell( new Wall() );
		Cell bornPlace = new Cell();
		Bomberman bomberman = new Bomberman( bornPlace );

		bomberman.stepInto(cell);

		bomberman.stepInto(cell);
		assertEquals( bomberman.isIn(bornPlace) , true );
	}

	@Test
	public void steps_into_a_cell_which_is_busy_with_an_enemy_then_he_dies(){
		Cell cellWithBolban = new Cell( new Bolban() );
		Bomberman bomberman = new Bomberman();

		bomberman.stepInto( cellWithBolban );

		assertEquals( bomberman.idDead(), true );

	}
}
