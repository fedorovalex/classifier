package activation_functions;

import java.util.List;

public interface Activation {
    double activation(List<Double> inputs, List<Double> w);
}
