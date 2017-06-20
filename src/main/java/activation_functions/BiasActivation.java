package activation_functions;

import neurons.Input;

import java.util.List;

public class BiasActivation implements Activation {
    public double activate(List<Input> inputs) {
        return inputs.get(0).getX();
    }
}
