public class PokemonTest{
    public static void main(String[] args){
        Pokedex pDex1 = new Pokedex();
        Pokemon p1 = pDex1.createPokemon("Pikachu", 1000, "Electric");
        Pokemon p2 = pDex1.createPokemon("Squirtle", 900, "Water");
        
        System.out.println(pDex1.pokemonInfo(p1));
        pDex1.attackPokemon(p1);

        System.out.println(pDex1.pokemonInfo(p1));
    }
}