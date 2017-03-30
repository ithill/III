package tw.leonchen.myproject.io;

import java.io.Closeable;
import java.io.IOException;

public class AutoClose implements Closeable {
	public void processRource(){
		System.out.println("Rource Processing!");
	}

	@Override
	public void close() throws IOException {
		System.out.println("Rource Closing!");
		
	}

}
