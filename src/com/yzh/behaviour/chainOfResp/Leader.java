package com.yzh.behaviour.chainOfResp;

/**
 * @Author yzh
 * @Date 2020/4/23 14:29
 * @Version 1.0
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader() {
    }

    public Leader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public Leader(String name) {
        this.name = name;
    }

    public Leader(String name, Leader nextLeader) {
        this.name = name;
        this.nextLeader = nextLeader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理核心的业务方法
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}
