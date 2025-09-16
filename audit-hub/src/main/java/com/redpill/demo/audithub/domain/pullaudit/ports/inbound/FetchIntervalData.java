package com.redpill.demo.audithub.domain.pullaudit.ports.inbound;

public interface FetchIntervalData {

    interface Param {

    }

    void run(FetchIntervalData.Param param);
}
