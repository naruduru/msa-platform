package com.mingus.msa.dashboard.controller;

import com.mingus.msa.dashboard.dto.DashBoardDto;
import com.mingus.msa.dashboard.service.IDashBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/msa")
@Slf4j
public class DashBoardController {

    private final IDashBoardService dashBoardService;

    public DashBoardController(IDashBoardService dashBoardService) {
        this.dashBoardService = dashBoardService;
    }

    @PostMapping("/dashboard")
    public void newDashBoard(@RequestBody DashBoardDto dashBoardDto) {
        log.info("newDashBoard");

        dashBoardService.postDashboard(dashBoardDto);
    }

    @GetMapping("/dashboard")
    public List<DashBoardDto> getDashBoardList() {
        log.info("1111");

        return dashBoardService.getDashBoardList();
    }

}
