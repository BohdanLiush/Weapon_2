import java.util.ArrayList;

public class Enchanter   {

    /*Axe axe = new Axe();
    Sword sword = new Sword();
    Pike pike = new Pike();
    Scroll scroll = new Scroll();*/
    Axe axe;
    Sword sword;
    Pike pike;
    Scroll scroll;

    public Enchanter() {
        axe = new Axe();
        pike = new Pike();
        sword = new Sword();
        scroll = new Scroll();
        //enchanterMeth();
    }

    public void enchanterMeth(){
        scroll.standartScroll(axe);
        scroll.standartScroll(pike);
        scroll.standartScroll(sword);

        /*scroll.enchanteScroll(axe);
        scroll.enchanteScroll(sword);
        scroll.enchanteScroll(sword);*/
    }

    public static void main(String[] args) {

        Enchanter enchanter = new Enchanter();
        for (int i = 0; i < 5; i++) {
            enchanter.enchanterMeth();
        }

       /* for (int i = 0; i < 5; i++) {
            enchanter.standartScroll(new Axe());
            enchanter.standartScroll(new Sword());
            enchanter.standartScroll(new Pike());
        }*/

        /*for (int i = 0; i < 5; i++){
            scroll.standartScroll(axe);
            scroll.standartScroll(sword);
            scroll.standartScroll(pike);
        }

        for (int i = 0; i < 5; i++) {
            scroll.enchanteScroll(axe);
            scroll.enchanteScroll(sword);
            scroll.enchanteScroll(pike);
        }*/
    }
}
