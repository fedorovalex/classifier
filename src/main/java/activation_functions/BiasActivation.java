package activation_functions;

import java.util.List;

public class BiasActivation implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        return inputs.get(0);
    }
}
