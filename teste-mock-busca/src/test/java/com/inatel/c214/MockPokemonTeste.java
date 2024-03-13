package test.java.com.inatel.c214;

import main.java.com.inatel.c214.PokemonService;

import java.util.ArrayList;

public class MockPokemonService implements PokemonService {

  @Override
  public String busca(int id) {

    if (id == 10) {
      return InimigoConst.CARTEPIE;
    } else if (id == 20) {
      return InimigoConst.PIKACHU;
    }
  }

  @Override
  public boolean pokemonExistente(int id) {
    // Aceitando somente IDs 10 e 20. Pode-se melhorar a logica para aceitar também
    // IDs positivos
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(id) || list.get(i).equals(id)) {
        return true;
      } else {
        return false;
      }
    }

    return false;
  }
}