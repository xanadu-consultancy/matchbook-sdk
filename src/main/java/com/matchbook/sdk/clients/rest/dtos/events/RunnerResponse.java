package com.matchbook.sdk.clients.rest.dtos.events;

import com.matchbook.sdk.clients.rest.dtos.MatchbookResponse;

public class RunnerResponse implements MatchbookResponse {

    private Runner runner;

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

}
