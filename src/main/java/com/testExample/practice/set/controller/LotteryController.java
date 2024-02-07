package com.testExample.practice.set.controller;

import com.testExample.practice.set.model.vo.Lottery;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LotteryController {


    @Getter
    private Set<Lottery> winners;

    private HashSet loterry = new HashSet<>();
    private HashSet win = new HashSet<>();

    public LotteryController() {
        this.loterry = new HashSet<>();

    }
    public boolean insertObject(Lottery l) {
        return loterry.add(l);
    }

    public boolean deleteObject(Lottery l){
        return loterry.remove(l);
    }
    public boolean winObject(Lottery l) {
        ArrayList winArray = new ArrayList<>();
        winArray.add(loterry);
        return loterry.add(l);
    }
    public TreeSet getSortedWinners() {
        return null;
    }

    public boolean searchWinner() {
        return true;
    }
}
