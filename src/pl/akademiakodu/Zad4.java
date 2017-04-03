package pl.akademiakodu;

/**
 * Created by Moody on 2017-03-13.
 */
public class Zad4 {

    public int add(int liczba1, int liczba2){
        if(liczba2 == 0) throw new IllegalAccessException("Nie dziel przez 0 cholero!");
        return liczba1/liczba2;
    }

}
