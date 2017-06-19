package activation_functions;

import java.util.List;

public class ClassicActivation implements Activation {
    public double activation(List<Double> inputs, List<Double> w) {
        double result = 0;
        for (int i = 0; i <= inputs.size(); i++) {
            result += inputs.get(i)*w.get(i);
        }
        return result;
    }
}
