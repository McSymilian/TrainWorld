package com.rydwas.trainworld.train.locmotive;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public class ElectricLocomotive extends Locomotive {

    @Getter
    @NotNull
    private String engineModel;
    @Getter
    @NotNull
    private boolean pantographed;

    @Getter
    @NotNull
    private int maxPullCapacity;

    @Getter
    @NotNull
    private int voltage;
}
