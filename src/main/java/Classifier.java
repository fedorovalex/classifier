import neural_network.Factory;
import neural_network.Network;

import java.util.*;

public class Classifier {
    public static void main(String[] args) {

        Network network = new Factory().assembleNetwork();

        network.setStartInput(Arrays.asList(100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0));
        network.start();
        network.getOut().forEach(System.out::println);
    }
}
