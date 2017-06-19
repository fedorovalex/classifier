package activation_functions.linguistic_variables.confidence;

import activation_functions.Activation;

import java.util.List;

public class HighConfidence implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double input = inputs.get(0);
        return Math.exp(-Math.pow(input-50, 2)*Math.pow(15,2)*2);
    }
}
