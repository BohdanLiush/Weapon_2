import java.util.ArrayList;
import java.util.Random;

public class Scroll {

        public void standrtUpdate (Weapon weapon, int counter){
           // for (int i = 0; i < 5; i++) {
                Random random = new Random();
                int a = random.nextInt(100);

            System.out.print(a + " ");
            System.out.println(weapon.getClass().getSimpleName() + " " + weapon.level);

            switch (weapon.getClass().getSimpleName()){
                case "Axe": if (a < weapon.percent * counter) {
                    weapon.level += 1;
                } else
                    weapon.level = 0;
                    break;
                case "Sword": if (a < weapon.percent * counter) {
                    weapon.level++;
                } else {
                    return;
                }
                    break;
                case "Pike": if (a < weapon.percent * counter) {
                    weapon.level += 1;
                } else {
                    return;
                }
                    break;
            }
        }


    public void standartScroll(Weapon weapon){
        standrtUpdate(weapon, 1);
    }

    public void enchanteScroll(Weapon weapon){
        standrtUpdate(weapon,2);
    }
}
