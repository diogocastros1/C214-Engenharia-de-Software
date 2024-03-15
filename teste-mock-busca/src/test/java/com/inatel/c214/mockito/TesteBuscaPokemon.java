package com.inatel.c214.test.mockito;

import com.inatel.c214.BuscaPokemon;
import com.inatel.c214.Pokemon;
import com.inatel.c214.PokemonService;
import com.inatel.c214.test.PokemonConst;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaPokemon {

    @Mock
    private PokemonService service;
    private BuscaPokemon buscaPokemon;

    @Before
    public void setup(){
        buscaPokemon = new BuscaPokemon(service);
    }

    @Test
    public void testeBuscaPokemonSkeleton(){
        Mockito.when(service.busca(55)).thenReturn(PokemonConst.CARTEPIE);

        Pokemon skeleton = buscaPokemon.buscaPokemon(55);
        //Faz assertion
        assertEquals("Skeleton", skeleton.getNome());
        assertEquals(200.0, skeleton.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", skeleton.getArma());

    }

    @Test
    public void testeBuscaPokemonInvalido(){
        Mockito.when(service.busca(56)).thenReturn(PokemonConst.INEXISTENTE);

        Pokemon skeleton = buscaPokemon.buscaPokemon(56);
        //Faz assertion
        assertEquals("Inexistente", skeleton.getNome());
        assertEquals(0, skeleton.getQtdVida(), 0.1);
        assertEquals("Inexistente", skeleton.getArma());

    }

    @Test
    public void testeBuscaPokemonValido(){

        Mockito.when(service.pokemonExistente(10)).thenReturn(true);
        //Faz a busca de um pokemon válido (id = 10 ou id = 20 ou ID positivo)
        boolean pokemonValido = service.pokemonExistente(10);

        assertTrue(pokemonValido);
    }


}