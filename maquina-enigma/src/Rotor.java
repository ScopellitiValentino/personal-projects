import java.util.ArrayList;
import java.util.List;

public class Rotor {

    private List<Character> letras;
    private Integer posicionActual;


    public Rotor() {
        letras = new ArrayList<Character>();
        for (Character c = 'A'; c <= 'Z'; c++) {
            letras.add(c);
        }
        posicionActual = 0;
    }

    public void girar(){
        posicionActual = (posicionActual + 1) % letras.size();
    }

    public Character cifrar(Character entrada) {
        Integer index = entrada - 'A';
        Integer cifradoIndex = (index + posicionActual) % letras.size();
        return letras.get(cifradoIndex);
    }

    public Character descifrar(Character entrada) {
        Integer index = letras.indexOf(entrada);
        Integer descifradoIndex = (index - posicionActual + letras.size()) % letras.size();
        return (char) ('A' + descifradoIndex);
    }

    public List<Character> getLetras() {
        return letras;
    }

    public void setLetras(List<Character> letras) {
        this.letras = letras;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }
}
