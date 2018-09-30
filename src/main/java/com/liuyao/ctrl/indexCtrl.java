package com.liuyao.ctrl;

import com.liuyao.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @program: web
 * @description: 主ctrl
 * @author: LiuB
 * @create: 2018-09-27 11:07
 **/
@Slf4j
@RestController
public class indexCtrl {
    @Autowired
    MemberService memberService;

    @RequestMapping(path = {"/index"})
    @ResponseBody
    public String index(String username){
        log.info("welcome in my site");
        System.out.println("welcome in my site");
        return "index.html";
    }

    @RequestMapping(path = {"/login"})
    @ResponseBody
    public String loginM(String member_id){
        log.info(member_id+" 调用查询");
        try {
            Long start = System.currentTimeMillis();
            for(int i=0;i<60;i++){
                log.info(memberService.queryM(member_id).toString());
            }
            Long end = System.currentTimeMillis();
            long settime = (end-start);
            System.out.println("运行时间:"+settime+"ms");
            return memberService.queryM(member_id).toString();
        } catch (NullPointerException e) {
            log.info("NullPointerException in : No Data Back");
            return "NullPointerException in : No Data Back";
        } catch (SqlSessionException s){
            log.info("sql error");
            return "sql error";
        }
    }
}
