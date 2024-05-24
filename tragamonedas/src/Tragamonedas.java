import java.security.SecureRandom;

public class Tragamonedas {
    private Integer[][] cells;
    private SecureRandom random = new SecureRandom();
    private static Integer BOUNTY = 100;
    public Tragamonedas(){
        this.cells = new Integer[3][3];
    }

    public void generateCells() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] =  random.nextInt((6 - 1)) + 1;
            }
        }
    }

    public Integer checkConditions() {
        Integer agreements = 0;
        for (int i = 0; i < 3; i++) {
            if (cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) agreements++;
            if (cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]) agreements++;
        }
        if (cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2]) agreements++;
        if (cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0]) agreements++;

        return agreements;
    }

    public void showInterface() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Integer calculateProfits(Integer agreements){
        return BOUNTY * agreements;
    }

    public Integer play(){
        System.out.println("##########TRAGAMONEDAS##########");
        generateCells();
        showInterface();
        System.out.println("GANANCIAS EN ESTA TIRADA: " + calculateProfits(checkConditions()));
        return calculateProfits(checkConditions());
    }

}


