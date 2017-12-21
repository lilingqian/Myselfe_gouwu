package lijingqian.example.lenovo.myselfe_gouwu.model;


import java.util.Map;

import lijingqian.example.lenovo.myselfe_gouwu.bean.GetCartBean;
import lijingqian.example.lenovo.myselfe_gouwu.net.OnNetListener;


public interface GetCartService {
    void getCart(Map<String, String> params, OnNetListener<GetCartBean> onNetListener);
}
