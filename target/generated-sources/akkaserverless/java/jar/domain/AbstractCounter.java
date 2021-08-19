/* This code is managed by Akka Serverless tooling.
 * It will be re-generated to reflect any changes to your protobuf definitions.
 * DO NOT EDIT
 */

package jar.domain;

import com.akkaserverless.javasdk.EntityId;
import com.akkaserverless.javasdk.Reply;
import com.akkaserverless.javasdk.valueentity.*;
import com.google.protobuf.Empty;
import jar.CounterApi;

/** A value entity. */
public abstract class AbstractCounter {
    
    @CommandHandler
    public abstract Reply<Empty> increase(CounterApi.IncreaseValue command, CommandContext<CounterDomain.CounterState> ctx);
    
    @CommandHandler
    public abstract Reply<Empty> decrease(CounterApi.DecreaseValue command, CommandContext<CounterDomain.CounterState> ctx);
    
    @CommandHandler
    public abstract Reply<Empty> reset(CounterApi.ResetValue command, CommandContext<CounterDomain.CounterState> ctx);
    
    @CommandHandler
    public abstract Reply<CounterApi.CurrentCounter> getCurrentCounter(CounterApi.GetCounter command, CommandContext<CounterDomain.CounterState> ctx);
}