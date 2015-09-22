package com.dada;

/**
 * Created by dnalband on 30/08/15.
 */
public class Test {


        public static void main(String[] args) {

            String value = "[{\"entityIdentifier\":{\"entityId\":1,\"entityType\":\"com.cisco.sdp.core.market.beans.Market\"},\"namedValueList\":[{\"name\":\"cust_id\",\"value\":\"1269\"}]},{\"entityIdentifier\":{\"entityId\":5000000,\"entityType\":\"com.cisco.sdp.core.market.beans.Market\"},\"namedValueList\":[{\"name\":\"cust_id\",\"value\":\"99\"}]}]";

            String str = value.substring(
                    value.indexOf("cust_id:",
                            value.indexOf("entityId:" + 5000000)) + 8,
                    value.indexOf('}',
                            value.indexOf("entityId:" + 5000000)));

            System.out.println(str);

        }
}
