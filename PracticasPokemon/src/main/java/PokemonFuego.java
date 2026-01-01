public class PokemonFuego extends Pokemon{

    public PokemonFuego(String nombre,int nivel){
        super(nombre,"Fuego",nivel);
    };
    @Override
    public void atacar(Pokemon objetivo){
        int danoFinal = this.nivel * 2;
        if(objetivo.tipo.equals("Planta")){
            danoFinal = danoFinal * 2;
            System.out.println("Ha sido super efectivo");
        } else if (objetivo.tipo.equals("Fuego") || objetivo.tipo.equals("Agua")) {
            danoFinal = danoFinal / 2;
            System.out.println("No ha sido muy efectivo");
        }
        objetivo.recibirDano(danoFinal);
    };
}
