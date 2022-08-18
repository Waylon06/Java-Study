package DorySystem.dao;

import DorySystem.model.Account;
import DorySystem.model.Dorimitory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Mapper {

//    //    查询全部数据
//    List<Account> getAccount();
    //    查询账户
    Account selAccount(@Param("id") int id, @Param("password") String password);
    //    增加账户
    int addAccount(Account account);
//    //    删除账户
//    int delAccountList(@Param("id") int id);
//    //    修改账户
//    int updAccountList(Account account);
    //    查询全部宿舍信息
    List<Dorimitory>getDory();
//    //    按照doryid号查询宿舍信息
    List<Dorimitory>selStu(@Param("sinstructor")String sinstructor);
    //    按照stuid号查询宿舍信息
    List<Dorimitory>selDory();

    List<Dorimitory>selInsStu(@Param("sinstructor")String sinstructor);
//    //    新增寝室信息
    int addDory(Dorimitory dorimitory);
    //    按doryId删除寝室信息
    int delDory(@Param("dname") String dname,@Param("dnum") int dnum);
//    //    按stuId删除寝室信息
    int updStu(@Param("sstate") String sstate,@Param("dname") String dname,@Param("dnum") int dnum,@Param("sname") String sname);
    //    修改寝室信息
//    int udpDoryList(Dorimitory dorimitory);
}
