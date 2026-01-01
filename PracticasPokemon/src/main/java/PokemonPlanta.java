public class PokemonPlanta extends Pokemon{

    public PokemonPlanta(String nombre,int nivel){
        super(nombre,"Planta",nivel);
    };

    @Override
    public void atacar(Pokemon objetivo){
        int danoFinal = this.nivel * 2;
        if(objetivo.tipo.equals("Agua")){
            danoFinal = danoFinal  * 2;
            System.out.println("Ha sido super efectivo");
        } else if (objetivo.tipo.equals("Planta") || objetivo.tipo.equals("Fuego")) {
            danoFinal = danoFinal / 2;
            System.out.println("No es muy efectivo");
        }
        objetivo.recibirDano(danoFinal);

    };

}
