public class Maquina {

   private Rotor rotor1;
   private Rotor rotor2;
   private Rotor rotor3;



    public Maquina() {
        this.rotor1 = new Rotor();
        this.rotor2 = new Rotor();
        this.rotor3 = new Rotor();
    }

    public void ponerEstadoInicial(Integer i,Integer j,Integer k) {
        moverRotorAPosicion(rotor1, i);
        moverRotorAPosicion(rotor2, j);
        moverRotorAPosicion(rotor3, k);
    }

    private void moverRotorAPosicion(Rotor rotor, Integer posicion) {
        Integer girosNecesarios = (posicion - rotor.getPosicionActual() + 26) % 26;
        for (Integer i = 0; i < girosNecesarios; i++) {
            rotor.girar();
        }
    }


    public Character cifrarLetra (Character letra){

        Character letraCifrada = rotor3.cifrar(rotor2.cifrar(rotor1.cifrar(letra)));
        return letraCifrada;
    }

}
