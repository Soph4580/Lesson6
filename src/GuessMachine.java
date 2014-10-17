public class GuessMachine {
    private int number;
    private int numGuesses;
    private int guess;
    
    public GuessMachine(){
        number=(int)(Math.random()*100)+1;
        guess=0;
        numGuesses=0;
    }
    
    //To do: Add methods
    //giveHint(), setGuess(), getNumGuesses()

    boolean setGuess(int guess) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object giveHint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNumGuesses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
