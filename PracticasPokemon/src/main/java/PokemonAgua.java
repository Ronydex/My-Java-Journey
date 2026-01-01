public class PokemonAgua extends Pokemon{

    //El "extends" significa que heredara atributos de la clase Pokemon

    //Este es el puente de datos,el super permite a una subclase(PokemonAgua) acceder a miembros(metodos,constructores,campos) de su clase padre(superclase(Pokemon))
    public PokemonAgua(String nombre, int nivel){
        super(nombre,"Agua",nivel);
    };

    @Override
    public void atacar(Pokemon objetivo){
        int danoFinal = this.nivel * 2;
        if(objetivo.tipo.equals("Fuego")){
            danoFinal= danoFinal *2;
            System.out.println("Ha sido super efectivo");
        } else if (objetivo.tipo.equals("Agua") || objetivo.tipo.equals("Planta")) {
            danoFinal = danoFinal/2;
            System.out.println("No es muy efectivo");
        }
     objetivo.recibirDano(danoFinal);
    };

}
