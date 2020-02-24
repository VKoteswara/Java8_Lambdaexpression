package com.nisum.lambdaexpressions;

import com.nisum.functionalinterfaces.CountOfOrder;
import com.nisum.functionalinterfaces.SingleParameter;
import com.nisum.functionalinterfaces.ZeroParameter;

import java.util.List;

public class LambdaExpressionsDemo {

    public void ZeroParam(ZeroParameter zp){

        zp.zeroParam();
    }

    public String singleParameter(String str,SingleParameter sp){
        return sp.singleParameter(str);
    }

    public void countOfOrders(List list, CountOfOrder countOfOrders)
    {
        System.out.println(countOfOrders.count(list));
    }


}
