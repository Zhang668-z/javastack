package cn.javastack.test.designpattern.strategy;

import org.springframework.stereotype.Service;

/**
 * 支付宝
 * @author: R哥
 * @from: 公众号：Java技术栈
 */
@Service("Alipay")
public class Alipay implements IPayment {

    @Override
    public PayResult pay(Order order) {
        return new PayResult("支付宝支付成功");
    }

}
