package com.testExample.practice.set.controller;

import com.testExample.practice.set.model.vo.Lottery;

import java.util.HashSet;
import java.util.Set;

public class LotteryController {

    private Set<Lottery> lotterySet;
    private Set<Lottery> winners;

    public LotteryController() {
        this.lotterySet = new HashSet<>();
    }
    public boolean insertObject(Lottery entry) {
        if (lotterySet.contains(entry)) {
            return false;
        } else {
            lotterySet.add(entry);
            return true;
        }

    }

    public boolean deleteObject(Lottery entry){
        return lotterySet.remove(entry);
    }
    public boolean winObject(Lottery entry) {
        return winners.add(entry);
    }
}
