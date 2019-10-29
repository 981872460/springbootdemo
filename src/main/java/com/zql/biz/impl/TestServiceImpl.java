package com.zql.biz.impl;

import com.zql.biz.TestService;
import com.zql.common.dao.ScoreMapper;
import com.zql.common.dto.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    private static String NUM = null;

    @Resource
    private ScoreMapper scoreMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<Score> scoreList() {
        Score s = new Score();
        s.setId(8);
        s.setClas("36");
        s.setScores(13);
        s.setUserId(32);
        scoreMapper.updateByPrimaryKey(s);
        scoreMapper.insert(s);
        return scoreMapper.scoreList();
    }

}
