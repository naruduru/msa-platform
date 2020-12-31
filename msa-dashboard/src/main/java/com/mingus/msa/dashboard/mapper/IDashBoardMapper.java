package com.mingus.msa.dashboard.mapper;

import com.mingus.msa.dashboard.controller.DashBoardController;
import com.mingus.msa.dashboard.dto.DashBoardDto;
import com.mingus.msa.dashboard.vo.DashBoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IDashBoardMapper {
    void postDashboard(DashBoardVO dashBoardVO);

    List<DashBoardDto> getDashBoardList();
}
