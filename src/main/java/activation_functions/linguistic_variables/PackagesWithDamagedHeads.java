package activation_functions.linguistic_variables;

import activation_functions.Activation;
import neurons.Input;

import java.util.List;

public class PackagesWithDamagedHeads implements Activation {
    public double activate(List<Input> inputs) {
        double input = inputs.get(0).getX();
        return 1/(1 + Math.exp(-2*(input-5)));
    }
}
