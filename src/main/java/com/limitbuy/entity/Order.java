package com.limitbuy.entity;

import java.util.List;

/**
 * Created by longwu on 15/10/28.
 */
public class Order extends  BaseModel{
    public static final String order_status_init_chinese = "已下单";
    public static final String order_status_cancel_chinese = "已取消";
    public static final String order_paystatus_n = "n";// 未支付
    public static final String order_paystatus_y = "y";// 全部支付

    private long id;
    private String account;//订单付款账户
    private String status;//订单状态
    private String amount;//订单总金额
    private int quantity;//商品总数量
    private List<Product> productList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
