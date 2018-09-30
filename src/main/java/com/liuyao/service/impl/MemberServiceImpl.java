package com.liuyao.service.impl;
import com.liuyao.dao.MemberDao;
import com.liuyao.model.Member;
import com.liuyao.service.MemberService;
import com.liuyao.util.AsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @program: web
 * @description: memberServiceImpl
 * @author: LiuB
 * @create: 2018-09-27 20:07
 **/

@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

    Member member = new Member();

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private AsyncTask asyncTask;

    @Override
    public Member queryM(String member_id) {
        //拉一个异步线程
        asyncTask.start();
        log.info("execute queryM");
        member = memberDao.queryM(member_id);
        return member;
    }
}
