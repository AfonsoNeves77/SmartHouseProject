package pt.ipp.isep.dei.examples.basic.ui;

import pt.ipp.isep.dei.examples.basic.domain.Bloco5.Matrix;
import pt.ipp.isep.dei.project.domain.Room;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InstantiationException {

        ArrayList<Room> arrayOfStrings = new ArrayList<>();

        Room r1 = new Room("1",6);
        Room r2 = new Room("2",6);
        Room r3 = new Room("1",6);
        Room r4 = new Room("1",6);
        arrayOfStrings.add(r1);
        arrayOfStrings.add(r2);
        arrayOfStrings.add(r3);
        arrayOfStrings.add(r4);


        List<Room> unmod = Collections.unmodifiableList(arrayOfStrings);
        unmod.get(0).createRoomDimensions(1,2,1);
        System.out.println(r2.getDimensions().toString());





    }
}




