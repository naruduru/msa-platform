package com.mingus.msa.dashboard.controller;

import com.mingus.msa.dashboard.dto.DashBoardDto;
import com.mingus.msa.dashboard.service.IDashBoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/msa/")
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

    @GetMapping("/dashboard2/test")
    public List<DashBoardDto> getDashBoardList2() {
        log.info("1111");

        return dashBoardService.getDashBoardList();
    }

}
