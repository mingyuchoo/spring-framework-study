package com.playanetworks.springmvc.dao;

import com.playanetworks.springmvc.vo.MemberVO;;

public interface MemberDAO {
    public String getTime();

    public void insertMember(MemberVO memberVo);

    public MemberVO readMember(String userId) throws Exception;

    public MemberVO readWithPW(String userId, String userPw) throws Exception;
}
