package activation_functions.linguistic_variables.different_IPs;

import activation_functions.Activation;

import java.util.List;

public class HighDifferentIPs implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double input = inputs.get(0);
        return 1 - 1/(1 + Math.exp(-0.3*(input+25)));
    }
}
