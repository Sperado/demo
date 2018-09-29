package com.sperado.demo.epay.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sperado.demo.epay.model.Trade;
import com.sperado.demo.epay.service.TradeService;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.util.encoders.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {

    @Autowired
    private TradeService tradeService;

    public String createTrade(@RequestParam String jsonParam) {
        JSONObject obj = new JSONObject();
        obj.put("code", "0000");
        if (StringUtils.isBlank(jsonParam)) {
            obj.put("code", "0001");
            obj.put("msg", "invalid parameter");
            return obj.toJSONString();
        }
        try {
            Trade trade = JSON.parseObject(new String(Base64.decode(jsonParam)), Trade.class);
            int result = tradeService.createTrade(trade);
            obj.put("result", result);
        } catch (Exception e) {
            obj.put("code", "9999");
            obj.put("msg", "system error");
        }
        return obj.toJSONString();
    }

}
