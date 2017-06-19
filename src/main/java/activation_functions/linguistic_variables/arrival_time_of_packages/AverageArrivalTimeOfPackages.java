package activation_functions.linguistic_variables.arrival_time_of_packages;

import activation_functions.Activation;

import java.util.List;

public class AverageArrivalTimeOfPackages implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double input = inputs.get(0);
        return 1 - 1/(1 + Math.exp(-0.3*(input+15)));
    }
}
