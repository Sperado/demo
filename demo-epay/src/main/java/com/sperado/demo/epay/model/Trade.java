package com.sperado.demo.epay.model;

import java.io.Serializable;

public class Trade implements Serializable {
    private String tradeId;         // 交易ID
    private String merchantId;      // 商户ID
    private String channelId;       // 支付渠道ID
    private String orderNo;         // 订单编号
    private Long amount;            // 支付金额，单位：分
    private String currency;        // 三位货币代码，人民币：cny
    private Byte status;            // 交易状态，0-交易生成，1-支付中，2-支付成功，3-业务处理完成
}
