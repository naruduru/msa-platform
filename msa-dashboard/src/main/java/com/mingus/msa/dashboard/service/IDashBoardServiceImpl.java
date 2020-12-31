package com.mingus.msa.dashboard.service;

import com.mingus.msa.dashboard.dto.DashBoardDto;
import com.mingus.msa.dashboard.mapper.IDashBoardMapper;
import com.mingus.msa.dashboard.vo.DashBoardVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IDashBoardServiceImpl implements IDashBoardService {

    private final IDashBoardMapper dashBoardMapper;

    public IDashBoardServiceImpl(IDashBoardMapper dashBoardMapper) {
        this.dashBoardMapper = dashBoardMapper;
    }

    @Override
    public void postDashboard(DashBoardDto dashBoardDto) {
        DashBoardVO dashBoardVO = DashBoardVO.builder()
                                             .title("타이틀 테스트")
                                             .seq(1)
                                             .build();

        dashBoardMapper.postDashboard(dashBoardVO);
    }

    @Override
    public List<DashBoardDto> getDashBoardList() {
        return dashBoardMapper.getDashBoardList();
    }
}
