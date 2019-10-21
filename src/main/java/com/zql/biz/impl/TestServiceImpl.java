package com.zql.biz.impl;

import com.zql.biz.TestService;
import com.zql.common.dao.ScoreMapper;
import com.zql.common.dto.Score;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private static String NUM = null;

    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public List<Score> scoreList() {
        int a = 0;
        System.out.println();
        for (int i = 0; i < 1000; i++) {
            a++;
            System.out.println(a);
        }
        System.out.println(a);
        return scoreMapper.scoreList();
    }

}
