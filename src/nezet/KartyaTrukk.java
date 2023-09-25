package nezet;
import modell.Pakli;
import java.util.Scanner;

public final class KartyaTrukk {

    private static Scanner sc;
    private final Pakli pakli;

    public KartyaTrukk() {
        KartyaTrukk.sc = new Scanner(System.in);
        pakli=new Pakli();
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
            System.out.println(kirak());
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        System.out.println("A választott lap: " + pakli.ezVolt().getLeiras());
    }
    
    public String kirak(){
        String tmp="";
        for (int i = 1; i < pakli.getLapok().length; i++) {
            tmp+="%-8s".formatted(pakli.getLapok()[i].getLeiras());
            if (i % 3 == 0) {
                tmp+="\r\n";
            }
        }
        return tmp;
    }
}
