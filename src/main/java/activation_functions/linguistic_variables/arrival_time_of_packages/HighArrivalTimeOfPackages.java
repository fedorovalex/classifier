package activation_functions.linguistic_variables.arrival_time_of_packages;

import activation_functions.Activation;
import neurons.Input;

import java.util.List;

public class HighArrivalTimeOfPackages implements Activation {
    public double activate(List<Input> inputs) {
        double input = inputs.get(0).getX();
        return  Math.exp(-Math.pow(input-63, 2)*Math.pow(0.025, 2)*2);
    }
}
