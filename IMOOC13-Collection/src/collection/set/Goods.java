package collection.set;

public class Goods {
    private String title;
    private String sn;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public String getSn() {
        return sn;
    }

    public Goods() {
    }

    public Goods(String sn, String title) {
        this.setTitle(title);
        this.setSn(sn);
    }

    //    重写toString
    @Override
    public String toString() {
        return this.hashCode() + "=Goods(" +
                "sn='" + sn + '\'' +
                "title='" + title + '\'' + " )";
    }

    //    重写hashCode 以sn为判断条件
    @Override
    public int hashCode() {
        return this.sn.hashCode();
    }

    //辅以hashCode做校验 一是因为hashCode可能会出现hash碰撞值相同 二是hash运算比较equals效率更高
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Goods) {
            Goods goods = (Goods) obj;//强制转换
            if (this.sn.equals(goods.sn)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
