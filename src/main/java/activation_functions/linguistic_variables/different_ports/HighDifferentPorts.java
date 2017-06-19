package activation_functions.linguistic_variables.different_ports;

import activation_functions.Activation;

import java.util.List;

public class HighDifferentPorts implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double input = inputs.get(0);
        return 1 - 1/(1 + Math.exp(-2*(input-3)));
    }
}
