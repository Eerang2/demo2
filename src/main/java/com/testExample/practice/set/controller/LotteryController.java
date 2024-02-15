package com.testExample.practice.set.controller;

import com.testExample.practice.set.model.vo.Lottery;
import lombok.Getter;

import java.util.*;

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
    public HashSet winObject() {
        ArrayList winArray = new ArrayList<>();
        Iterator iterator = loterry.iterator();
        while (iterator.hasNext()) {

            winArray.add(loterry);
        }
        Collections.shuffle(winArray);
        if (winArray.size() < 4) {
            win = null;
        } else {
            for (int i = 0; i < 4; i++) {
                win.add(winArray.get(i));
            }
        }
        return win;
    }

    public TreeSet getSortedWinners() {
        return null;
    }

    public boolean searchWinner(Lottery l) {
        return win.contains(l);
    }
}
