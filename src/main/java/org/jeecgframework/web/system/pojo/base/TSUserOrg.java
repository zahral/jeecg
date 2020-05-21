package org.jeecgframework.web.system.pojo.base;

import org.jeecgframework.core.common.entity.IdEntity;

import javax.persistence.*;

/**
 * 用户-组织机构 实体
 */
@Entity
@Table(name = "t_s_user_org")
public class TSUserOrg extends IdEntity implements java.io.Serializable {
    private TSUser tsUser;
    private TSDepart tsDepart;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    public TSUser getTsUser() {
        return tsUser;
    }

    public void setTsUser(TSUser tsDepart) {
        this.tsUser = tsDepart;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "org_id")
    public TSDepart getTsDepart() {
        return tsDepart;
    }

    public void setTsDepart(TSDepart tsDepart) {
        this.tsDepart = tsDepart;
    }
}
