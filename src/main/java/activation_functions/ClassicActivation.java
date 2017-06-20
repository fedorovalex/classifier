package activation_functions;

import neurons.Input;

import java.util.List;

public class ClassicActivation implements Activation {
    public double activate(List<Input> inputs) {
        double result = 0;
        for (int i = 0; i < inputs.size(); i++) {
            double x = inputs.get(i).getX();
            double w = inputs.get(i).getW();
            result += x*w;
        }
        return result;
    }
}
