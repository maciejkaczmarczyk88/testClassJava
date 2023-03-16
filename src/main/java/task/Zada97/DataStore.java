package task.Zada97;

public class DataStore {
    private int numbersComputers = 5;
    private Computer[] computers = new Computer[numbersComputers];
    private int sizeNumber = 0;
    private int count = 0;

    public void add(Computer computer) {
        computers[sizeNumber] = computer;
        sizeNumber++;
    }

    public void printComputer(){
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

    public int checkAvailability(Computer computer){
        for (int i = 0; i < computers.length; i++) {
            if (computer.equals(computers[i])){
                count++;
            }
        }
        return count;
    }
}
