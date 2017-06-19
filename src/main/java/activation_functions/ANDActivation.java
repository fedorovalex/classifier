package activation_functions;

import activation_functions.Activation;

import java.util.List;

public class ANDActivation implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double result = 1;

        for (int i = 0; i <= inputs.size(); i++) {
            result *= w.get(i) + inputs.get(i) - w.get(i)*inputs.get(i);
        }

        return result;
    }
}
