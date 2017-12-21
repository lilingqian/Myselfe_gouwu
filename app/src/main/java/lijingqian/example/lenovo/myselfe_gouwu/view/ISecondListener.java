package lijingqian.example.lenovo.myselfe_gouwu.view;

import java.util.List;

import lijingqian.example.lenovo.myselfe_gouwu.bean.GetCartBean;


/**
 * Created by peng on 2017/12/14.
 */

public interface ISecondListener {
    void show(List<GetCartBean.DataBean> group, List<List<GetCartBean.DataBean.ListBean>> child);
}
