package scanner;

public class WhiteSpaceState extends  State {

    @Override
    public void scan(Character c, Scanner scanner) {
        scanner.nextCharacter();
        scanner.setState(new SelectionState());
    }

    @Override
    public void finish(Scanner scanner) {

    }
}
