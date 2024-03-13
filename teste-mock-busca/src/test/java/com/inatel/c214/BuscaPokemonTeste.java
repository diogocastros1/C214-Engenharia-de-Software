package com.inatel.c214;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.com.inatel.c214.BuscaPokemon;
import main.java.com.inatel.c214.Pokemon;

public class BuscaPokemonTeste {
    @Test
    public void testeBuscaPokemonCaterpie() {
        PokemonService service = new MockPokemonService();
        BuscaPokemon buscaPokemon = new BuscaPokemon();

        Pokemon caterpie = buscaPokemon.buscaPokemon(10);

        assertEquals("Cartepie",caterpie.getNome());
        assertEquals(30.0,caterpie.getQtdVida(), 0.1);
        assertEquals("Inseto",caterpie.getArma());
    }
}
