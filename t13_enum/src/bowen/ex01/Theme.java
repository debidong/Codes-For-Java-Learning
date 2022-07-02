package bowen.ex01;

public enum Theme {
    DAY_MODE("日间模式"), DARK_MODE("夜间模式");

    private String zh_cn;
    private Theme(String zh_cn) {
        this.zh_cn = zh_cn;
    }

    @Override
    public String toString() {
        return this.zh_cn;
    }
}
