package Game;

import java.util.Random;

public class Role {
    private String name;
    private int blood;


    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //    定义一个方法去攻击
    public void attack(Role role) {

//        计算造成的伤害1~20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
//        修改挨揍人的血量
        int remainBlood = role.getBlood() - hurt;
//        对血量做一个验证，如果为负数，就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
//        修改挨揍人的血量
        role.setBlood(remainBlood);

        System.out.println(this.getName() + "攻击了" + role.getName() + "造成了" + hurt + "点伤害" + role.getName() + "还剩下" + remainBlood + "点血");
    }
}
