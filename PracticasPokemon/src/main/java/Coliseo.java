
import java.util.Scanner;

public class Coliseo {
    public static void main(String[] args) {

        Scanner comandos = new Scanner(System.in);
        //Eligiendo Pokemon
        Pokemon pkmn1 = new PokemonPlanta("Bulbasaur",12);
        Pokemon pkmn2 = new PokemonFuego("Charmander",12);
        Pokemon pkmn3 = new PokemonAgua("Squirtle",12);


        while(true){
            System.out.println("Bienvenido al COLISEO,elige un Pokemon para empezar");
            System.out.println("1."+pkmn1.nombre + " --HP "+pkmn1.getHp() +" NV." + pkmn1.nivel);
            System.out.println("2."+pkmn2.nombre + " --HP "+pkmn2.getHp() +" NV." + pkmn2.nivel);
            System.out.println("3."+pkmn3.nombre + " --HP "+pkmn3.getHp() +" NV." + pkmn3.nivel);

            System.out.println("¿Que Pokemon Eliges?");
            int pkmnElegido = comandos.nextInt();

            System.out.println("¿A que Pokemon enfrentar?");
            int pkmnEnemigo = comandos.nextInt();

            Pokemon atacante = null;
            Pokemon defensor = null;

            if(pkmnElegido==1){
                atacante = pkmn1;
            }
            else if (pkmnElegido==2) {
                atacante = pkmn2;
            }
            else if (pkmnElegido==3){
                atacante = pkmn3;
            }

            if (pkmnEnemigo==1){
                defensor= pkmn1;
            } else if (pkmnEnemigo==2) {
                defensor= pkmn2;
            } else if (pkmnEnemigo==3){
                defensor= pkmn3;
            }

            if(atacante != null && defensor != null){
                atacante.atacar(defensor);
            }else
            {
                System.out.println("Selección no valida");
            }
        }

    }
}
