package neurons;

import activation_functions.Activation;

import java.util.ArrayList;
import java.util.List;

public class Neuron {

    private Activation activation;
    private List<Input> inputs;
    private double output;

    public Neuron() {
        inputs = new ArrayList<>();
    }

    public Neuron(Activation activation) {
        inputs = new ArrayList<>();
        this.activation = activation;
    }

    public void setActivation(Activation activation) {
        this.activation = activation;
    }

    public boolean setInputs(List<Input> inputs) {
        this.inputs = inputs;
        return true;
    }

    public boolean addInput(Input input) {
        this.inputs.add(input);
        return true;
    }

    public boolean clearInputs() {
        this.inputs.clear();
        return true;
    }

    public List<Input> getInputs() {
        return inputs;
    }

    public boolean calculateOutput() {
        this.output = activation.activate(inputs);
        return true;
    }

    public double getOutput() {
        return this.output;
    }
}
