package pl.akademiakodu;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Main main = new Main();
        System.out.println(main.add(5,5));
        main.add(10,10);


    }

    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
