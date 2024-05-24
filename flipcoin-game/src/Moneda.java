import java.security.SecureRandom;

public class Moneda {
    public Moneda() {
    }

    public String tirar(){
        SecureRandom random = new SecureRandom();
        if (random.nextDouble() > 0.5) return "Cara";
        else return "Cruz";
    }

}
