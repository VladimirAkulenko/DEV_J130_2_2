/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

import java.util.List;

/**
 *
 * @author USER
 */
public class PositionsList {
    private static final PositionsList positionsInstance = new PositionsList();
    private final List<Positions> positionsList;

    public PositionsList() {
        positionsList = new Repository().getPositions();
    }

    public int getPositionsCount() {
        return positionsList.size();
    }

    public Positions getPositions(int index) {
        return positionsList.get(index);
    }

    public static PositionsList getPositionsInstance() {
        return positionsInstance;
    }

    public List<Positions> getPositionsList() {
        return positionsList;
    }
}
