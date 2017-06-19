package activation_functions.linguistic_variables.confidence;

import activation_functions.Activation;

import java.util.List;

public class MeanConfidence implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double input = inputs.get(0);
        return 1 - 1/(1 + Math.exp(-0.5*(input+25)));
    }
}
