package kartyatrukkkonzolon;
import java.util.Scanner;

public final class KartyaTrukk {

    private static Scanner sc;
    private final Pakli pakli=new Pakli();

    public KartyaTrukk() {
        KartyaTrukk.sc = new Scanner(System.in);
        indit();
    }
    
    private int melyik(){
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    
    void indit(){
        for (int i = 0; i < 3; i++) {
            pakli.kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        pakli.ezVolt();
    }
}
