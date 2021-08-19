/* This code is managed by Akka Serverless tooling.
 * It will be re-generated to reflect any changes to your protobuf definitions.
 * DO NOT EDIT
 */

package jar;

import com.akkaserverless.javasdk.AkkaServerless;
import com.google.protobuf.EmptyProto;
import jar.domain.Counter;
import jar.domain.CounterDomain;

public final class MainComponentRegistrations {
    
    public static AkkaServerless withGeneratedComponentsAdded(AkkaServerless akkaServerless) {
        return akkaServerless
                .registerValueEntity(
                    Counter.class,
                    CounterApi.getDescriptor().findServiceByName("CounterService"),
                    CounterDomain.getDescriptor(),
                    EmptyProto.getDescriptor()
                );
    }
}