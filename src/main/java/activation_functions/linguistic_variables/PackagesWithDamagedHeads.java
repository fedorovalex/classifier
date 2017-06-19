package activation_functions.linguistic_variables;

import activation_functions.Activation;

import java.util.List;

public class PackagesWithDamagedHeads implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double input = inputs.get(0);
        return 1/(1 + Math.exp(-2*(input-5)));
    }
}
