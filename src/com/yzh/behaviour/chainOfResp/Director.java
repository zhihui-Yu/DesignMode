package com.yzh.behaviour.chainOfResp;

/**
 * @Author yzh
 * @Date 2020/4/23 14:32
 * @Version 1.0
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<3){
            System.out.println("员工"+request.getEmpName()+"请假，天数："
                    +request.getLeaveDays()+"，理由："+request.getReason());
            System.out.println("主任："+this.name+"，审核通过。");
        }else {
            if( this.nextLeader != null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
