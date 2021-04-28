package cursoJava.constrThisSobreEncapsulamento.entities;

import java.util.Date;

public class Order {
    private Date date;
    private ProductConstr productConstr;

    public Order(Date date, ProductConstr productConstr) {
        this.date = date;
        this.productConstr = productConstr;
        this.productConstr.name = "TV";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ProductConstr getProductConstr() {
        return productConstr;
    }

    public void setProductConstr(ProductConstr productConstr) {
        this.productConstr = productConstr;
    }
}
