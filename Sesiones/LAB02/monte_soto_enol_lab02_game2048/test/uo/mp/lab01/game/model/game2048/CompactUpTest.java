package uo.mp.lab01.game.model.game2048;

import static org.junit.Assert.assertArrayEquals;


import org.junit.Test;

import uo.mp.lab01.game.model.Game2048;
import uo.mp.lab01.game.model.util.ForTesting;

public class CompactUpTest {

	/*
	 * Casos de uso
	 * 1. Matriz con un valor por fila en columna 0
	 * 2- Matriz con un valor por fila en columna 1
	 * 3- Matriz con un valor por fila en columna 2
	 * 
	 * 4- Matriz con 2 valores por fila (en 1 y 2)
	 * 5- Matriz con 2 valores por fila (en 0 y 1)
	 * 6- Matriz con 2 valores por fila (en 1 y 3)
	 * 
	 * 7- Matriz con 3 valores por fila 
	 * 
	 */
	
	/**
	 * Casos de uso
	 * 1. Matriz con un valor por fila en columna 0
	 */
	@Test
	public void OneValueForRowInColumn0() {

		Game2048 game = new Game2048(ForTesting.SEMIFULL31);
		game.compactUp();
		assertArrayEquals(ForTesting.SEMIFULL3_UPCOMPACTED, game.getBoardForTesting());
		
	}
	
	/**
	 * Casos de uso
	 * 2- Matriz con un valor por fila en columna 1
	 */
	@Test
	public void oneValueForRowInColumn1() {

		Game2048 game = new Game2048(ForTesting.SEMIFULL32);
		game.compactUp();
		assertArrayEquals(ForTesting.SEMIFULL3_UPCOMPACTED, game.getBoardForTesting());
		
	}
	
	/**
	 * Casos de uso
	 * 3- Matriz con un valor por fila en columna 2
	 */
	@Test
	public void oneValueForRowInColumn2() {

		Game2048 game = new Game2048(ForTesting.SEMIFULL33);
		game.compactUp();
		assertArrayEquals(ForTesting.SEMIFULL3_UPCOMPACTED, game.getBoardForTesting());
		
	}
	
	/**
	 * Casos de uso
	 * 4- Matriz con 2 valores por fila (en 1 y 2)
	 *
	 */
	@Test
	public void twoValuesForRowInColumn1And2() {

		Game2048 game = new Game2048(ForTesting.SEMIFULL41);
		game.compactUp();
		assertArrayEquals(ForTesting.SEMIFULL4_UPCOMPACTED, game.getBoardForTesting());
		
	}
	
	/**
	 * Casos de uso
	 * 5- Matriz con 2 valores por fila (en 0 y 1)
	 *
	 */
	@Test
	public void twoValuesForRowInColumn0And1() {

		Game2048 game = new Game2048(ForTesting.SEMIFULL42);
		game.compactUp();
		assertArrayEquals(ForTesting.SEMIFULL4_UPCOMPACTED, game.getBoardForTesting());
		
	}
	
	/**
	 * Casos de uso
	 * 6- Matriz con 2 valores por fila (en 1 y 3)
	 *
	 */
	@Test
	public void twoValuesForRowInColumn1And4() {

		Game2048 game = new Game2048(ForTesting.SEMIFULL43);
		game.compactUp();
		assertArrayEquals(ForTesting.SEMIFULL4_UPCOMPACTED, game.getBoardForTesting());
		
	}
	
	/**
	 * Casos de uso
	 * 7- Matriz con 3 valores por fila 
	 *
	 */
	@Test
	public void threeValuesForRow() {
	//		public static int[][] FULL = {{2,2,2},
	//		  							  {2,2,2},
	//		  							  {2,2,2}};
		Game2048 game = new Game2048(ForTesting.FULL);
		game.compactUp();
		assertArrayEquals(ForTesting.FULL, game.getBoardForTesting());
	}	
}


