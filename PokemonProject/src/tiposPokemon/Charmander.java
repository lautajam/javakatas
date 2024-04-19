package tiposPokemon;

import interfaces.IFuego;

public class Charmander extends Pokemon implements IFuego {


    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y este es mi ataque moridzco");
    }

    @Override
    public void tacarPunioFuego() {
        System.out.println("Soy Charmander y este es mi ataque puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y este es mi ataque ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y este es mi ataque lanzallamas");
    }
}
