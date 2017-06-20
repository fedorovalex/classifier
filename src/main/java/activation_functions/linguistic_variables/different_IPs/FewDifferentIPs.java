package activation_functions.linguistic_variables.different_IPs;

import activation_functions.Activation;
import neurons.Input;

import java.util.List;

public class FewDifferentIPs implements Activation {
    public double activate(List<Input> inputs) {
        double input = inputs.get(0).getX();
        return 1/(1 + Math.exp(-0.3*(input-75)));
    }
}
