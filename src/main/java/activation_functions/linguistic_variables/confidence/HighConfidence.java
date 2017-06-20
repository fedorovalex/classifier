package activation_functions.linguistic_variables.confidence;

import activation_functions.Activation;
import neurons.Input;

import java.util.List;

public class HighConfidence implements Activation {
    public double activate(List<Input> inputs) {
        double input = inputs.get(0).getX();
        return Math.exp(-Math.pow(input-50, 2)*Math.pow(15,2)*2);
    }
}
