package com.design_pattern.structural_pattern.Proxy_pattern.static_proxy;

public class LiSi implements Host {
    private Zhongjie zhongjie;
    public LiSi(Zhongjie zhongjie){
        this.zhongjie=zhongjie;
    }
    public LiSi() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        this.zhongjie=(Zhongjie)this.getClass().getClassLoader().loadClass("com.design_pattern.structural_pattern.Proxy_pattern.static_proxy.Zhongjie").newInstance();
    }
    @Override
    public void host() {
        zhongjie.host();
    }

    public static void main(String[] args) {
        new Zhongjie().host();
        new LiSi(new Zhongjie()).host();
    }
}
