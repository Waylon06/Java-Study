package com.waylon;

public class Username {
    String username;
    Boolean isval;

    public Username() {
    }

    public Username(String username) {
        this.username = username;
        isval = isValid();
    }

    public Boolean getIsval() {
        return isValid();
    }

    public void setIsval(Boolean isval) {
        this.isval = isval;
    }

    public String getUsername() {
        return username;
    }

    //    任务：判断用户名是否有效
    public void setUsername(String username) {
        this.username = username;
    }

    //验证是否合法
    public boolean isValid() {
        //匹配首字符是字母
        String reg = "[a-zA-Z]\\w+";
        if (username == "" || username == null)
            return false;
        else {
            boolean matches = username.matches(reg);
            return matches;
        }
    }
}
