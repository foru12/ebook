package com.example.testone.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataRate {
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("amount")
    @Expose
    private Integer amount;

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
