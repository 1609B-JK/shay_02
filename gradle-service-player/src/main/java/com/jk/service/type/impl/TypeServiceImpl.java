package com.jk.service.type.impl;

import com.jk.dao.type.TypeMapper;
import com.jk.pojo.type.MovieTypeResponse;
import com.jk.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by apple on 2017/5/25.
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<MovieTypeResponse> selectMovieTypeList() {
        return typeMapper.selectMovieTypeList();
    }
}
