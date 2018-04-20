package family.thrift;

import org.apache.thrift.TException;

/**
 * Created by yangboyu on 17/7/19.
 */
public class HelloServiceImpl implements Hello.Iface {
    public String helloString(String para) throws TException {
        return "[result]:"+para;
    }
}