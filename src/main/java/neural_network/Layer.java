package neural_network;

import neurons.Input;
import neurons.Neuron;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Layer {

    private class Relation {
        private Neuron neuron;
        private double w;

        public Relation(Neuron neuron, double w) {
            this.neuron = neuron;
            this.w = w;
        }

        public Neuron getNeuron() {
            return neuron;
        }

        public void setNeuron(Neuron neuron) {
            this.neuron = neuron;
        }

        public double getW() {
            return w;
        }

        public void setW(double w) {
            this.w = w;
        }
    }


    private Map<Neuron, List<Relation>> layerMap;

    public Layer() {
        layerMap = new HashMap<>();
    }

    public void setNeuron(Neuron neuron) {
        this.layerMap.put(neuron, new ArrayList<Relation>());
    }

    public void addAssociatedNeuron(Neuron neuron, Neuron associated, double w) {
        this.layerMap.get(neuron).add(new Relation(associated, w));
    }

    public List<Neuron> getNeurons() {
        return new ArrayList<Neuron>(this.layerMap.keySet());
    }

    public List<Neuron> getAssociatedNeuron(Neuron neuron) {
        return this.layerMap.get(neuron).stream().map(Relation::getNeuron).collect(Collectors.toList());
    }

    public void transferSignal(Neuron neuron) {
        double signal = neuron.getOutput();

        layerMap.get(neuron).forEach(relation -> relation.getNeuron().addInput(new Input(signal, relation.getW())));
    }
}
