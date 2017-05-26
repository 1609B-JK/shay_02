package com.jk.dao.type;

import com.jk.pojo.type.MovieTypeResponse;

import java.util.List;

/**
 * Created by apple on 2017/5/25.
 */
public interface TypeMapper {
    List<MovieTypeResponse> selectMovieTypeList();
}
