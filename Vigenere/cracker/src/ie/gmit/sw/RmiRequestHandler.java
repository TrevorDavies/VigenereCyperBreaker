package ie.gmit.sw;

import java.rmi.Naming;
import java.util.Map;
import java.util.concurrent.BlockingQueue;


public class RmiRequestHandler implements Runnable {
	
	
	BlockingQueue<MessageObject> queue;
	Map<Long, String> outMap ;
	
	
	public RmiRequestHandler(BlockingQueue<MessageObject> queue, Map<Long, String> out) {
		super();
		this.queue = queue;
		this.outMap = out;
	}

	@Override
	public void run() {
		try{
			while(true){
				 MessageObject msObj= queue.take();
				
				VigenereBreaker vb = (VigenereBreaker) Naming.lookup("rmi://127.0.0.1:1099/cypher-service");
				
				String result = vb.decrypt(msObj.getCyperText(),msObj.getMaxKeyLength());
				
				outMap.put(msObj.getJobNumber(), result);
			}
			
		}catch(Exception e){
			
		}
		
	}

	public boolean add(MessageObject arg0) {
		return queue.add(arg0);
	}
	
	
}
