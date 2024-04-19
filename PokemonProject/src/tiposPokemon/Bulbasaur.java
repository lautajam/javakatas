package tiposPokemon;

import interfaces.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Bulbasaur y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y este es mi ataque mordisco");
    }

    @Override
    public void tacarParalizar() {
        System.out.println("Soy Bulbasaur y este es mi ataque paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y este es mi ataque hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y este es mi ataque latigo cepa");
    }
}
