package neural_network;

import neurons.Input;
import neurons.Neuron;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static utils.DefinitionW.getRandomW;

public class Network {
    private List<Layer> layerList;

    public Network() {
        this.layerList = new ArrayList<Layer>();
    }

    public Network(List<Layer> layerList) {
        this.layerList = layerList;
    }

    public void setStartInput(List<Double> startInput) {
        List<Neuron> neuronList = layerList.get(0).getNeurons();
        for(int i = 0; i < startInput.size(); i++) {
            Neuron neuron = neuronList.get(i);
            neuron.addInput(new Input(startInput.get(i), getRandomW()));
        }
    }

    public void start() {
        for (Layer layer : layerList) {
            layer.getNeurons().forEach(Neuron::calculateOutput);
            layer.getNeurons().forEach(layer::transferSignal);
            layer.getNeurons().forEach(Neuron::clearInputs);
        }
    }

    public List<Double> getOut() {
        return layerList.get(layerList.size() - 1).getNeurons().stream().map(Neuron::getOutput).collect(Collectors.toList());
    }
}
