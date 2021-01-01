package com.mingus.msa.dashboard.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class DashBoardVO {
    private final int seq;
    private final String title;
    private final String subject;
}
