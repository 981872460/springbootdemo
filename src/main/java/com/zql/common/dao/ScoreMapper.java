package com.zql.common.dao;

import com.zql.common.dto.Score;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer id);

    List<Score> scoreList();

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}