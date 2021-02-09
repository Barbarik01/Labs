package services;
import java.util.Random;
import com.company.models.Droid;
import com.company.models.RobberDroid;

public class Service {
    Random rand = new Random();
    public void gameteam(Droid team1[], Droid team2[]){
        int i = 0;
        int j = 0;
        while (i < team1.length && j < team2.length){
        Droid winner = whoisthefirst(team1[i],team2[j]);
        if (winner.equals(team1[i])){
           j++;
            }
        else i++;
        }
        if (i == team1.length){
            System.out.println("team2");
        }
        else
            System.out.println("team1");
    }
    public Droid whoisthefirst(Droid droid1, Droid droid2){
        if(droid1.getClass() == RobberDroid.class && droid2.getClass() != RobberDroid.class){
            return game(droid1, droid2);
        }
        else if(droid1.getClass() != RobberDroid.class && droid2.getClass() == RobberDroid.class){
            return game(droid2, droid1);
        }
        else {
            int randomValue = rand.nextInt();
            if(randomValue%2 == 0)
                return game(droid1, droid2);
            else
                return game(droid2, droid1);
        }
    }
    public Droid game(Droid droid1, Droid droid2){
        boolean turn = true;
        int damage1 = droid1.getDamage();
        int damage2 = droid2.getDamage();
        int health1 = droid1.getHealth();
        int health2 = droid2.getHealth();
        while (health1 > 0 && health2 > 0){
            if(turn == true){
                health2 = health2 - damage1;
            }
            else
                health1 = health1 - damage2;
            turn = !turn;
        }
        if(health1 < 0){
            droid2.setHealth(health2);
            return droid2;
        }
        else {
            droid1.setHealth(health1);
            return droid1;
        }
    }
}
