package com.mingus.msa.dashboard.service;

import com.mingus.msa.dashboard.dto.DashBoardDto;

import java.util.List;

public interface IDashBoardService {
    void postDashboard(DashBoardDto dashBoardDto);

    List<DashBoardDto> getDashBoardList();
}
