package activation_functions.linguistic_variables.arrival_time_of_packages;

import activation_functions.Activation;

import java.util.List;

public class HighArrivalTimeOfPackages implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double input = inputs.get(0);
        return  Math.exp(-Math.pow(input-63, 2)*Math.pow(0.025, 2)*2);
    }
}
