public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }



    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        letter.toUpperCase();

        // if the letter has already been guessed, nothing happens
        if (!guessedLetters.contains(letter)) {
            if (!this.word.contains(letter)) {
                this.guessedLetters += letter;
                this.numberOfFaults++;
            } else if (this.word.contains(letter)) {
                this.guessedLetters += letter;
            }
        }
        // it the word does not contain the guessed letter, the number of faults increases
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in the hidden word
        // if the letter is not among the guessed ones, replace it with _ in the hidden word

        String returnedWord = "";

        for (int i = 0; i < this.word.length(); i++) {

            if (this.guessedLetters.indexOf(this.word.charAt(i)) == -1) {
                returnedWord += "_";
            } else {
                returnedWord += this.word.charAt(i);
            }
        }

        // return the hidden word at the end

        return returnedWord;
    }
}