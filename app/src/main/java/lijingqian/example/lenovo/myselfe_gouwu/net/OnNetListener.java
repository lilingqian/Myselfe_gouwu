package lijingqian.example.lenovo.myselfe_gouwu.net;



public interface OnNetListener<T> {
    public void onSuccess(T t);

    public void onFailure(Exception e);
}
