import java.util.Random;
import java.util.Scanner;

public class number{
    public static void main(String args[]){
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    
    public void setNoOfGuesses(int NoOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    
    void takeUserInput(){
        System.out.println("Guess The Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses ++;
        if(inputNumber == number){
            System.out.format("Yes you guessed it right, it was %d. \nYou guessed it in %d attempts.\n", number, noOfGuesses);
            return true; 
        }

        else if(inputNumber < number){
            System.out.println("Guess higher...");
        }

        else if(inputNumber > number){
            System.out.println("Guess Lower");
        }
        return false;
    }
}

