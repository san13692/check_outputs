package check_outputs;

import java.io.*;

class AirJet extends AirPlane {
public AirJet() throws IOException {
try {
throw new IOException();
} catch (IOException e) {
System.out.print("IOException is thrown in AirJet");
}
}
}


