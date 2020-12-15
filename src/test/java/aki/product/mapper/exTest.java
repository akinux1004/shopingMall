package aki.product.mapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class exTest {
	
	
	@Test
	public void readPage() throws FileNotFoundException, IOException {
		File file = new File("src\\main\\webapp\\resources\\guitar\\ex02.txt");
		if(file.exists()) {
			BufferedReader inFile = new BufferedReader(new FileReader(file));
			String line = null;
			String prefix = "str += '     ";
			String suffix = "';";
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			while((line = inFile.readLine()) != null) {
				System.out.println(prefix + line + suffix);
				
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			inFile.close();
			
			
		}
	}
	
}
