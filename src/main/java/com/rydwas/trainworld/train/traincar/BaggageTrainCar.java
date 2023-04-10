package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public class BaggageTrainCar extends TrainCar {
    @Getter
    @NotNull
    private int maxVolume;

    @Getter
    @NotNull
    private int maxWeight;
}