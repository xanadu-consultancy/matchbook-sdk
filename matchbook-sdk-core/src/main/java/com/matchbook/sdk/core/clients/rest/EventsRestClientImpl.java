package com.matchbook.sdk.core.clients.rest;

import com.matchbook.sdk.core.StreamObserver;
import com.matchbook.sdk.core.clients.rest.dtos.events.Event;
import com.matchbook.sdk.core.clients.rest.dtos.events.EventRequest;
import com.matchbook.sdk.core.clients.rest.dtos.events.EventsRequest;
import com.matchbook.sdk.core.clients.rest.dtos.events.EventsResponse;
import com.matchbook.sdk.core.clients.rest.dtos.events.Market;
import com.matchbook.sdk.core.clients.rest.dtos.events.MarketRequest;
import com.matchbook.sdk.core.clients.rest.dtos.events.MarketsRequest;
import com.matchbook.sdk.core.clients.rest.dtos.events.MarketsResponse;
import com.matchbook.sdk.core.clients.rest.dtos.events.Runner;
import com.matchbook.sdk.core.clients.rest.dtos.events.RunnerRequest;
import com.matchbook.sdk.core.clients.rest.dtos.events.RunnersRequest;
import com.matchbook.sdk.core.clients.rest.dtos.events.RunnersResponse;
import com.matchbook.sdk.core.clients.rest.dtos.events.Sport;
import com.matchbook.sdk.core.clients.rest.dtos.events.SportsRequest;
import com.matchbook.sdk.core.clients.rest.dtos.events.SportsResponse;
import com.matchbook.sdk.core.configs.ClientConnectionManager;

public class EventsRestClientImpl extends AbstractRestClient implements EventsRestClient {

    public EventsRestClientImpl(ClientConnectionManager clientConnectionManager) {
        super(clientConnectionManager);
    }

    @Override
    public void getSports(SportsRequest sportsRequest, StreamObserver<Sport> sportsObserver) {
        String url = getClientConfig().buildUrl(sportsRequest.resourcePath());
        getRequest(url, sportsRequest, sportsObserver, SportsResponse.class);
    }

    @Override
    public void getEvent(EventRequest eventRequest, StreamObserver<Event> eventObserver) {
        String url = getClientConfig().buildUrl(eventRequest.resourcePath());
        getRequest(url, eventRequest, eventObserver, Event.class);
    }

    @Override
    public void getEvents(EventsRequest eventsRequest, StreamObserver<Event> eventsObserver) {
        String url = getClientConfig().buildUrl(eventsRequest.resourcePath());
        getRequest(url, eventsRequest, eventsObserver, EventsResponse.class);
    }

    @Override
    public void getMarket(MarketRequest marketRequest, StreamObserver<Market> marketObserver) {
        String url = getClientConfig().buildUrl(marketRequest.resourcePath());
        getRequest(url, marketRequest, marketObserver, Market.class);
    }

    @Override
    public void getMarkets(MarketsRequest marketsRequest, StreamObserver<Market> marketsObserver) {
        String url = getClientConfig().buildUrl(marketsRequest.resourcePath());
        getRequest(url, marketsRequest, marketsObserver, MarketsResponse.class);
    }

    @Override
    public void getRunner(RunnerRequest runnerRequest, StreamObserver<Runner> runnerObserver) {
        String url = getClientConfig().buildUrl(runnerRequest.resourcePath());
        getRequest(url, runnerRequest, runnerObserver, Runner.class);
    }

    @Override
    public void getRunners(RunnersRequest runnersRequest, StreamObserver<Runner> runnersObserver) {
        String url = getClientConfig().buildUrl(runnersRequest.resourcePath());
        getRequest(url, runnersRequest, runnersObserver, RunnersResponse.class);
    }

}
