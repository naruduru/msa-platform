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

    @ApiOperation(value = "newDashBoard", notes = "대시보드 생성")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK !!"),
            @ApiResponse(code = 500, message = "Internal Server Error !!"),
            @ApiResponse(code = 404, message = "Not Found !!")
    })
    @PostMapping("/dashboard")
    public void newDashBoard(@RequestBody DashBoardDto dashBoardDto) {
        log.info("newDashBoard");

        dashBoardService.postDashboard(dashBoardDto);
    }

    @ApiOperation(value = "getDashBoardList", notes = "대시보드 조회")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK !!"),
            @ApiResponse(code = 500, message = "Internal Server Error !!"),
            @ApiResponse(code = 404, message = "Not Found !!")
    })
    @GetMapping("/dashboard")
    public List<DashBoardDto> getDashBoardList() {
        log.info("1111");

        return dashBoardService.getDashBoardList();
    }

}
