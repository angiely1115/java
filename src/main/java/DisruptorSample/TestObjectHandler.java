package DisruptorSample;import com.lmax.disruptor.EventHandler;import com.lmax.disruptor.WorkHandler;/** * Created with IntelliJ IDEA. * Project: test-jar * Author: Kevin * Date: 16/5/23 * Time: 下午4:11 */public class TestObjectHandler implements EventHandler<TestObject>,WorkHandler<TestObject> {	@Override	public void onEvent(TestObject event, long sequence, boolean endOfBatch) throws Exception {		this.onEvent(event);	}	@Override	public void onEvent(TestObject event) throws Exception {		System.out.println("some logic handle for " + event.getValue());	}}