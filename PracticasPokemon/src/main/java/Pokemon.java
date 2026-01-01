public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected int nivel;
    private int hp;

    public Pokemon(String nombre, String tipo, int nivel){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.hp = nivel * 10;
    };

    public int getHp() {
        return this.hp;
    }

    //Metodo de atacar de Pokemon
    public void atacar(Pokemon objetivo){
        System.out.println(nombre + " esta usando un ataque de tipo " +tipo);
        int dano = this.nivel * 2;
        System.out.println(this.nombre + " ataca a" +objetivo.nombre + "!");

        //Aqui le enviamos al otro el contrataque
        objetivo.recibirDano(dano);
    };

    //Metodo de recibirDano de Pokemon
    public void recibirDano(int cantidad){
        //En esta linea se resta los HP - cantidad de daño
        this.hp -= cantidad;
        System.out.println(this.nombre + " recibio " + cantidad + " de daño." );
        System.out.println("HP: " + this.hp);
        if(this.hp <= 0){
            System.out.println(this.nombre + "se ha debilitado" );
        }
        else{
            System.out.println(this.nombre +" le queda " + this.hp);
        };
    };

}
