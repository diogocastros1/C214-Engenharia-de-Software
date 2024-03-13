package main.java.com.inatel.c214;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class BuscaPokemon {
  Pokemon pokemonService;

  public BuscaPokemon(Pokemon service){
      this.pokemonService = service;
  }

  public Pokemon buscaPokemon(int id){
      // id = 10 -> buscando um pokemon de ID 10
      //PokemonJson é uma string que retornou do serviço
      String pokemonJson = pokemonService.busca(id);

      //jsonObject é um objeto JSON feito a partir da string de retonro
      JsonObject jsonObject = JsonParser.parseString(pokemonJson).getAsJsonObject();

      return new Pokemon(jsonObject.get("nome").getAsString(),
              jsonObject.get("qtdVida").getAsDouble(),
              jsonObject.get("arma").getAsString());
  }

  public boolean verificaArrayListExistente(int id){
      boolean pokemonExistente = pokemonService.pokemonExistente(id);

      if (pokemonExistente){
          return true;
      }else{
          return false;
      }
  }

}
  
