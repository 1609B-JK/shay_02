package com.jk.controller.type;

import com.jk.pojo.ResultData;
import com.jk.pojo.type.MovieTypeResponse;
import com.jk.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by apple on 2017/5/25.
 */
@Controller
@RequestMapping("type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @RequestMapping("select_movie_type_list")
    @ResponseBody
    public ResultData selectMovieTypeList() {
        String msg = "�ɹ�";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        //��ѯ�����б�
        List<MovieTypeResponse> typeList = typeService.selectMovieTypeList();
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(typeList);
        return rd;
    }
}
