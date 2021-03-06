package asw.springboot.web.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc; 
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders; 
import org.springframework.test.web.servlet.result.MockMvcResultMatchers; 
import org.springframework.http.MediaType; 
import static org.hamcrest.CoreMatchers.containsString; 

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloApplicationMockMvcWebTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void helloLucaTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello/Luca").accept(MediaType.TEXT_PLAIN))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.view().name("greeting"))
			.andExpect(MockMvcResultMatchers.model().attributeExists("name"))
			.andExpect(MockMvcResultMatchers.model().attribute("name", "Luca")) 
			.andExpect(MockMvcResultMatchers.content().string(containsString("Hello, <span>Luca</span>!")));
	}

}