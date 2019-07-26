package com.matchbook.sdk.rest.dtos.prices;

import java.math.BigDecimal;

public class Price {

    private Side side;
    private OddsType oddsType;
    private Currency currency;
    private BigDecimal amount;
    private BigDecimal odds;

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public OddsType getOddsType() {
        return oddsType;
    }

    public void setOddsType(OddsType oddsType) {
        this.oddsType = oddsType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getOdds() {
        return odds;
    }

    public void setOdds(BigDecimal odds) {
        this.odds = odds;
    }

    @Override
    public String toString() {
        return Price.class.getSimpleName() + " {" +
                "side=" + side +
                ", oddsType=" + oddsType +
                ", currency=" + currency +
                ", amount=" + amount +
                ", odds=" + odds +
                "}";
    }

}