package com.matchbook.sdk.core.clients.rest.dtos.offers;

import com.matchbook.sdk.core.clients.rest.dtos.PageableRequest;
import com.matchbook.sdk.core.clients.rest.dtos.PageableRequestBuilder;

public class OfferEditsRequest extends PageableRequest {

    private final Long offerId;

    private OfferEditsRequest(OfferEditsRequest.Builder builder) {
        super(builder);

        this.offerId = builder.offerId;
    }

    public Long getOfferId() {
        return offerId;
    }

    @Override
    public String toString() {
        return OfferEditsRequest.class.getSimpleName() + " {" +
                "offerId=" + offerId +
                ", offset=" + offset +
                ", perPage=" + perPage +
                "}";
    }

    public static class Builder extends PageableRequestBuilder {

        private final Long offerId;

        public Builder(Long offerId) {
            this.offerId = offerId;
        }

        public OfferEditsRequest build() {
            return new OfferEditsRequest(this);
        }
    }

}
