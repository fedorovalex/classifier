package activation_functions;

import activation_functions.Activation;
import neurons.Input;

import java.util.List;

public class ANDActivation implements Activation {
    public double activate(List<Input> inputs) {
        double result = 1;

        for (int i = 0; i < inputs.size(); i++) {
            double x = inputs.get(i).getX();
            double w = inputs.get(i).getW();
            result *= w + x - w*x;
        }

        return result;
    }
}
