package com.matchbook.sdk.rest.dtos.events;

import com.matchbook.sdk.rest.dtos.prices.Currency;
import com.matchbook.sdk.rest.dtos.prices.ExchangeType;
import com.matchbook.sdk.rest.dtos.prices.OddsType;
import com.matchbook.sdk.rest.dtos.prices.PageablePricesRequestTest;
import com.matchbook.sdk.rest.dtos.prices.PriceMode;
import com.matchbook.sdk.rest.dtos.prices.Side;

import java.math.BigDecimal;

class EventsRequestTest extends PageablePricesRequestTest<EventsRequest> {

    @Override
    protected EventsRequest newPageablePricesRequest(OddsType oddsType, ExchangeType exchangeType, Side side,
            Currency currency, BigDecimal minimumLiquidity, PriceMode priceMode, int offset, int perPage) {
        return new EventsRequest.Builder()
                .includePrices(true)
                .oddsType(oddsType)
                .exchangeType(exchangeType)
                .side(side)
                .currency(currency)
                .minimumLiquidity(minimumLiquidity)
                .priceMode(priceMode)
                .offset(offset)
                .perPage(perPage)
                .build();
    }

    @Override
    protected EventsRequest newEmptyRequest() {
        return new EventsRequest.Builder().build();
    }

}
