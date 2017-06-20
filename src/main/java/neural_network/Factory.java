package neural_network;

import activation_functions.ANDActivation;
import activation_functions.BiasActivation;
import activation_functions.ClassicActivation;
import activation_functions.ORActivation;
import activation_functions.linguistic_variables.PackagesWithDamagedHeads;
import activation_functions.linguistic_variables.arrival_time_of_packages.AverageArrivalTimeOfPackages;
import activation_functions.linguistic_variables.arrival_time_of_packages.HighArrivalTimeOfPackages;
import activation_functions.linguistic_variables.arrival_time_of_packages.SmallArrivalTimeOfPackages;
import activation_functions.linguistic_variables.different_IPs.FewDifferentIPs;
import activation_functions.linguistic_variables.different_IPs.HighDifferentIPs;
import activation_functions.linguistic_variables.different_ports.FewDifferentPorts;
import activation_functions.linguistic_variables.different_ports.HighDifferentPorts;
import neurons.Neuron;

import java.util.ArrayList;
import java.util.List;

import static utils.DefinitionW.getRandomW;

public class Factory {

    public Network assembleNetwork() {
        Neuron tHigh = new Neuron(new HighArrivalTimeOfPackages());
        Neuron tMiddle = new Neuron(new AverageArrivalTimeOfPackages());
        Neuron tLittle = new Neuron(new SmallArrivalTimeOfPackages());
        Neuron extaLots = new Neuron(new HighDifferentIPs());
        Neuron extaLittle = new Neuron(new FewDifferentIPs());
        Neuron pLots = new Neuron(new HighDifferentPorts());
        Neuron pLittle = new Neuron(new FewDifferentPorts());
        Neuron dhLots = new Neuron(new PackagesWithDamagedHeads());

        Neuron biasLayerTwo = new Neuron(new BiasActivation());
        Neuron orLayerTwo1 = new Neuron(new ORActivation());
        Neuron orLayerTwo2 = new Neuron(new ORActivation());
        Neuron andLayerTwo = new Neuron(new ANDActivation());

        Neuron biasLayerThree = new Neuron(new BiasActivation());
        Neuron andLayerThree1 = new Neuron(new ANDActivation());
        Neuron andLayerThree2 = new Neuron(new ANDActivation());

        Neuron classic1 = new Neuron(new ClassicActivation());
        Neuron classic2 = new Neuron(new ClassicActivation());
        Neuron classic3 = new Neuron(new ClassicActivation());

        Layer layerOne = new Layer();
        Layer layerTow = new Layer();
        Layer layerThree = new Layer();
        Layer layerFour = new Layer();

        layerOne.setNeuron(tHigh);
        layerOne.setNeuron(tMiddle);
        layerOne.setNeuron(tLittle);
        layerOne.setNeuron(extaLots);
        layerOne.setNeuron(extaLittle);
        layerOne.setNeuron(pLots);
        layerOne.setNeuron(pLittle);
        layerOne.setNeuron(dhLots);

        layerOne.addAssociatedNeuron(tHigh, biasLayerTwo, getRandomW());
        layerOne.addAssociatedNeuron(tMiddle, orLayerTwo1, getRandomW());
        layerOne.addAssociatedNeuron(tLittle, orLayerTwo1, getRandomW());
        layerOne.addAssociatedNeuron(extaLots, orLayerTwo2, getRandomW());
        layerOne.addAssociatedNeuron(extaLittle, andLayerTwo, getRandomW());
        layerOne.addAssociatedNeuron(pLots, orLayerTwo2, getRandomW());
        layerOne.addAssociatedNeuron(pLittle, andLayerTwo, getRandomW());
        layerOne.addAssociatedNeuron(dhLots, orLayerTwo2, getRandomW());

        layerTow.setNeuron(biasLayerTwo);
        layerTow.setNeuron(orLayerTwo1);
        layerTow.setNeuron(orLayerTwo2);
        layerTow.setNeuron(andLayerTwo);

        layerTow.addAssociatedNeuron(biasLayerTwo, biasLayerThree, getRandomW());
        layerTow.addAssociatedNeuron(orLayerTwo1, andLayerThree1, getRandomW());
        layerTow.addAssociatedNeuron(orLayerTwo1, andLayerThree2, getRandomW());
        layerTow.addAssociatedNeuron(orLayerTwo2, andLayerThree1, getRandomW());
        layerTow.addAssociatedNeuron(andLayerTwo, andLayerThree2, getRandomW());

        layerThree.setNeuron(biasLayerThree);
        layerThree.setNeuron(andLayerThree1);
        layerThree.setNeuron(andLayerThree2);

        layerThree.addAssociatedNeuron(biasLayerThree, classic1, getRandomW());
        layerThree.addAssociatedNeuron(andLayerThree1, classic1, getRandomW());
        layerThree.addAssociatedNeuron(andLayerThree1, classic2, getRandomW());
        layerThree.addAssociatedNeuron(andLayerThree1, classic3, getRandomW());
        layerThree.addAssociatedNeuron(andLayerThree2, classic1, getRandomW());
        layerThree.addAssociatedNeuron(andLayerThree2, classic2, getRandomW());
        layerThree.addAssociatedNeuron(andLayerThree2, classic3, getRandomW());

        layerFour.setNeuron(classic1);
        layerFour.setNeuron(classic2);
        layerFour.setNeuron(classic3);

        List<Layer> layers = new ArrayList<>();

        layers.add(layerOne);
        layers.add(layerTow);
        layers.add(layerThree);
        layers.add(layerFour);

        return new Network(layers);
    }

}
