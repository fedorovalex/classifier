package activation_functions;

import neurons.Input;

import java.util.List;

public interface Activation {
    double activate(List<Input> inputs);
}
